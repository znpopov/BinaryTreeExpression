package com.fmi.tree.builder;

import com.fmi.tree.AbsNode;

public class AbsNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode() {
		this.node = new AbsNode();
	}

}
