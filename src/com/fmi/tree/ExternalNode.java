package com.fmi.tree;

public class ExternalNode implements ArithmeticTreeExpression {
	
	private int data;
	
	public ExternalNode() {
		super();
	}
	
	public ExternalNode(int data) {
		super();
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
		System.out.println(this.data);
	}

}
