package com.fmi.tree.builder;

import com.fmi.tree.SubstractionNode;

public class SubstractionNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode() {
		this.node = new SubstractionNode();
	}

}
