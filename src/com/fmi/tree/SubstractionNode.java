package com.fmi.tree;

public class SubstractionNode extends InternalNode {
	
	public SubstractionNode() {
		super("-");
	}
	
	@Override
	public int process() {
		return leftNode.process() - rightNode.process();
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}
	
}
