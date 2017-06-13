package com.fmi.tree;

import com.fmi.tree.observer.TreeSubject;

public class SubstractionNode extends InternalNode {
	
	public SubstractionNode(TreeSubject subject) {
		super("-");
		this.treeSubject = subject;
		this.treeSubject.attach(this);
	}
	
	@Override
	public int process() {
		return leftNode.process() - rightNode.process();
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public void update() {
		System.out.println("Performing adjusted substraction with state " + this.treeSubject.getState()); 
	}
	
}
