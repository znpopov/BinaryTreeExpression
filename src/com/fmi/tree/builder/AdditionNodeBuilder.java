package com.fmi.tree.builder;

import com.fmi.tree.AdditionNode;
import com.fmi.tree.observer.TreeSubject;

public class AdditionNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode(TreeSubject subject) {
		this.node = new AdditionNode(subject);
	}

}
