package com.fmi.tree.builder;

import com.fmi.tree.ArithmeticTreeExpression;
import com.fmi.tree.observer.TreeSubject;

public abstract class ArithmeticTreeBuilder {
	
	protected ArithmeticTreeExpression node;
	
	protected ArithmeticTreeExpression getNode() {
		return node;
	}
	
    public abstract void createNewNode(TreeSubject subject);
	
}
