package com.fmi.tree;

public interface TreeVisitor {
	
	int visit(AdditionNode node);
	
	int visit(SubstractionNode node);
	
	int visit(MultiplicationNode node);
	
	int visit(AbsNode node);
	
	int visit(ExternalNode node);

}
