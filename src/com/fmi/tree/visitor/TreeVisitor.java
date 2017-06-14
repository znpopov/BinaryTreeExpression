package com.fmi.tree.visitor;

import com.fmi.tree.AbsNode;
import com.fmi.tree.AdditionNode;
import com.fmi.tree.ExternalNode;
import com.fmi.tree.MultiplicationNode;
import com.fmi.tree.SubstractionNode;

public interface TreeVisitor {
	
	int visit(AdditionNode node);
	
	int visit(SubstractionNode node);
	
	int visit(MultiplicationNode node);
	
	int visit(AbsNode node);
	
	int visit(ExternalNode node);

}
