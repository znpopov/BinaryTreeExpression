package com.fmi.tree.builder;

import com.fmi.tree.AdditionNode;

public class AdditionNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode() {
		this.node = new AdditionNode();
	}

}
