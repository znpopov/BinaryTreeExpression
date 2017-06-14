package com.fmi.tree;

import com.fmi.tree.visitor.TreeVisitor;

public interface ArithmeticTreeExpression {
	
	ArithmeticTreeExpression getLeftNode();
	
	ArithmeticTreeExpression getRightNode();
	
	void setLeftNode(ArithmeticTreeExpression node);
	
	void setRightNode(ArithmeticTreeExpression node);
	
	int accept(TreeVisitor visitor);
	
	int process();
	
	void printData();
	
	void switchOn();
	
	void switchOff();
	
}
