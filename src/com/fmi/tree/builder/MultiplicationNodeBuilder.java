package com.fmi.tree.builder;

import com.fmi.tree.MultiplicationNode;
import com.fmi.tree.observer.TreeSubject;

public class MultiplicationNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode(TreeSubject subject) {
		this.node = new MultiplicationNode(subject);
	}

}
