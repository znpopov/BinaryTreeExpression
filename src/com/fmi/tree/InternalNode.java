package com.fmi.tree;

public abstract class InternalNode implements ArithmeticTreeExpression {
	
	protected String data;
	protected ArithmeticTreeExpression leftNode;
	protected ArithmeticTreeExpression rightNode;
	
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
		System.out.println(data);
	}
	
}
