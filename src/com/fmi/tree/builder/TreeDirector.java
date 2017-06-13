package com.fmi.tree.builder;

import com.fmi.tree.ArithmeticTreeExpression;
import com.fmi.tree.observer.TreeSubject;

public class TreeDirector {
	
	private ArithmeticTreeBuilder treeBuilder;
	
	public void setBuilder(ArithmeticTreeBuilder builder) {
		this.treeBuilder = builder;
	}
	
    public ArithmeticTreeExpression getTreeNode() {
        return treeBuilder.getNode();
    }
    
    public void constructTree(TreeSubject subject) {
    	treeBuilder.createNewNode(subject);
    }

}
