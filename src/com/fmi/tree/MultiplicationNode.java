package com.fmi.tree;

import com.fmi.tree.observer.TreeSubject;

public class MultiplicationNode extends InternalNode {
	
	public MultiplicationNode(TreeSubject subject) {
		super("*");
		this.treeSubject = subject;
		this.treeSubject.attach(this);
	}
	
	@Override
	public int process() {
		if (leftNode != null && rightNode != null) {
			return leftNode.process() * rightNode.process();
		}
		return 1;
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public void update() {
		System.out.println("Performing adjusted multiplication with state " + this.treeSubject.getState()); 
	}

}
