package com.fmi.tree;

public class AbsNode extends InternalNode {
	
	public AbsNode() {
		super("a");
	}
	
	@Override
	public int process() {
		return Math.abs(leftNode.process());
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}

}
