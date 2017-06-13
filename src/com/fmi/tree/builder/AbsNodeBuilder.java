package com.fmi.tree.builder;

import com.fmi.tree.AbsNode;
import com.fmi.tree.observer.TreeSubject;

public class AbsNodeBuilder extends ArithmeticTreeBuilder {
	
	@Override
	public void createNewNode(TreeSubject subject) {
		this.node = new AbsNode(subject);
	}

}
