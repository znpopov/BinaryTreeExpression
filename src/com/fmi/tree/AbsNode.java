package com.fmi.tree;

import com.fmi.tree.observer.TreeSubject;

public class AbsNode extends InternalNode {
	
	public AbsNode(TreeSubject subject) {
		super("a");
		this.treeSubject = subject;
		this.treeSubject.attach(this);
	}
	
	@Override
	public int process() {
		return Math.abs(leftNode.process());
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public void update() {
		System.out.println("Performing adjusted absolute value with state " + this.treeSubject.getState()); 
	}

}
