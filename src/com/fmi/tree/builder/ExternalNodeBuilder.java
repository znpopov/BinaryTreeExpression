package com.fmi.tree.builder;

import com.fmi.tree.ExternalNode;
import com.fmi.tree.observer.TreeSubject;

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
	public void createNewNode(TreeSubject subject) {
		this.node = new ExternalNode(subject, data);
	}

}
