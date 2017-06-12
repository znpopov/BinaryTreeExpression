package com.fmi.tree;

public class EvalTreeVisitor implements TreeVisitor {
	
	@Override
	public int visit(AdditionNode tree) {
		return tree.getLeftNode().accept(this) * tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(SubstractionNode tree) {
		return tree.getLeftNode().accept(this) * tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(MultiplicationNode tree) {
		return tree.getLeftNode().accept(this) * tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(AbsNode tree) {
		return tree.getLeftNode().accept(this) * tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(ExternalNode node) {
		return node.getData();
	}

}
