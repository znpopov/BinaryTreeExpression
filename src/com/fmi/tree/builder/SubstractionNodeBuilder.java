package com.fmi.tree.builder;

import com.fmi.tree.SubstractionNode;
import com.fmi.tree.observer.TreeSubject;

public class SubstractionNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode(TreeSubject subject) {
		this.node = new SubstractionNode(subject);
	}

}
