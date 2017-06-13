package com.fmi.tree;

import com.fmi.tree.observer.TreeObserver;
import com.fmi.tree.observer.TreeSubject;

public class ExternalNode extends TreeObserver implements ArithmeticTreeExpression {
	
	private int data;
	private boolean lightOn = true;
	
	public ExternalNode() {
		super();
	}
	
	public ExternalNode(TreeSubject subject, int data) {
		super();
		this.treeSubject = subject;
		this.treeSubject.attach(this);
		this.data = data;
	}
	
	public ArithmeticTreeExpression getLeftNode() {
		return null;
	}
	public void setLeftNode(ArithmeticTreeExpression leftNode) {
		// do nothing
	}
	public ArithmeticTreeExpression getRightNode() {
		return null;
	}
	public void setRightNode(ArithmeticTreeExpression rightNode) {
		// do nothing
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
		
	@Override
	public int process() {
		return data;
	}
	
	@Override
	public int accept(TreeVisitor visitor) {
		return visitor.visit(this);
	}
	
	@Override
	public void printData() {
		System.out.println(data + " lights on: " + lightOn);
	}
	
	@Override
	public void update() {
		this.data += this.treeSubject.getState();
	}
	
	@Override
	public void switchOn() {
		lightOn = true;
	}
	
	@Override
	public void switchOff() {
		lightOn = false;
	}

}
