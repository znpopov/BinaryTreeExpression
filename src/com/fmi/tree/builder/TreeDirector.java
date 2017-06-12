package com.fmi.tree.builder;

import com.fmi.tree.ArithmeticTreeExpression;

public class TreeDirector {
	
	private ArithmeticTreeBuilder treeBuilder;
	
	public void setBuilder(ArithmeticTreeBuilder builder) {
		this.treeBuilder = builder;
	}
	
    public ArithmeticTreeExpression getTreeNode() {
        return treeBuilder.getNode();
    }
    
    public void constructTree() {
    	treeBuilder.createNewNode();
    }

}
