package com.fmi.tree;

public class MultiplicationNode extends InternalNode {
	
	public MultiplicationNode() {
		super("*");
	}
	
	@Override
	public int process() {
		if (leftNode != null && rightNode != null) {
			return leftNode.process() * rightNode.process();
		}
		return 1;
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}

}
