package com.fmi.tree.visitor;

import com.fmi.tree.AbsNode;
import com.fmi.tree.AdditionNode;
import com.fmi.tree.ExternalNode;
import com.fmi.tree.MultiplicationNode;
import com.fmi.tree.SubstractionNode;

public class EvalTreeVisitor implements TreeVisitor {
	
	@Override
	public int visit(AdditionNode tree) {
		return tree.getLeftNode().accept(this) + tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(SubstractionNode tree) {
		return tree.getLeftNode().accept(this) - tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(MultiplicationNode tree) {
		return tree.getLeftNode().accept(this) * tree.getRightNode().accept(this);
	}
	
	@Override
	public int visit(AbsNode tree) {
		return Math.abs(tree.getLeftNode().accept(this));
	}
	
	@Override
	public int visit(ExternalNode node) {
		return node.getData();
	}

}
