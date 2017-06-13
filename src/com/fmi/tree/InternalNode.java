package com.fmi.tree;

import com.fmi.tree.observer.TreeObserver;

public abstract class InternalNode extends TreeObserver implements ArithmeticTreeExpression {
	
	protected String data;
	protected ArithmeticTreeExpression leftNode;
	protected ArithmeticTreeExpression rightNode;
	boolean lightOn = true;
	
	public InternalNode(String data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public ArithmeticTreeExpression getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(ArithmeticTreeExpression leftNode) {
		this.leftNode = leftNode;
	}
	public ArithmeticTreeExpression getRightNode() {
		return rightNode;
	}
	public void setRightNode(ArithmeticTreeExpression rightNode) {
		this.rightNode = rightNode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public void printData() {
		System.out.println(data + " lights on: " + lightOn);
	}
	
	@Override
	public void switchOn() {
		lightOn = true;
		this.getLeftNode().switchOn();
		this.getRightNode().switchOn();
	}
	
	@Override
	public void switchOff() {
		lightOn = false;
		this.getLeftNode().switchOff();
		this.getRightNode().switchOff();
	}
	
}
