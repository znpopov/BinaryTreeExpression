package com.fmi.tree.builder;

import com.fmi.tree.ExternalNode;

public class ExternalNodeBuilder extends ArithmeticTreeBuilder {
	
	int data;
	
	public ExternalNodeBuilder() {
		super();
	}
	
	public ExternalNodeBuilder(int data) {
		super();
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public void createNewNode() {
		this.node = new ExternalNode(data);
	}

}
