package com.fmi.tree.builder;

import com.fmi.tree.ArithmeticTreeExpression;

public abstract class ArithmeticTreeBuilder {
	
	protected ArithmeticTreeExpression node;
	
	protected ArithmeticTreeExpression getNode() {
		return node;
	}
	
    public abstract void createNewNode();
	
}
