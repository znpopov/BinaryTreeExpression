package com.fmi.tree;

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
