package com.fmi.tree;

public class AdditionNode extends InternalNode {
	
	public AdditionNode() {
		super("+");
	}
	
	@Override
	public int process() {
		if (leftNode != null && rightNode != null) {
			return leftNode.process() + rightNode.process();
		}
		return 0;
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}

}
