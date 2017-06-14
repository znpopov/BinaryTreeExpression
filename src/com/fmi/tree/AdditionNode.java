package com.fmi.tree;

import com.fmi.tree.observer.TreeSubject;
import com.fmi.tree.visitor.TreeVisitor;

public class AdditionNode extends InternalNode {
	
	public AdditionNode(TreeSubject subject) {
		super("+");
		this.treeSubject = subject;
		this.treeSubject.attach(this);
	}
	
	@Override
	public int process() {
		if (leftNode != null && rightNode != null) {
			return leftNode.process() + rightNode.process();
		}
		return 0;
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public void update() {
		System.out.println("Performing adjusted addition with state " + this.treeSubject.getState()); 
	}

}
