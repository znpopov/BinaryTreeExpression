package com.fmi.tree.builder;

import com.fmi.tree.MultiplicationNode;

public class MultiplicationNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode() {
		this.node = new MultiplicationNode();
	}

}
