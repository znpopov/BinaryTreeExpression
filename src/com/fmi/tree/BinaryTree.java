package com.fmi.tree;

import com.fmi.tree.observer.TreeSubject;

public class BinaryTree {
	
	ArithmeticTreeExpression root;
	
	public static void main(String[] args) {
		System.out.println("STARRRRRRRRTTTTTTTTTT");
        BinaryTree tree = new BinaryTree();
        TreeSubject subject = new TreeSubject();
        tree.root = new AbsNode(subject);
        tree.root.setLeftNode(new SubstractionNode(subject));
        tree.root.setRightNode(new ExternalNode(subject, 3));
        tree.root.getLeftNode().setLeftNode(new ExternalNode(subject, 4));
        tree.root.getLeftNode().setRightNode(new ExternalNode(subject, 5));
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
        int result = tree.root.process();
        System.out.println("Result is: " + result);
	}
	
	private void printPreorder(ArithmeticTreeExpression node) {
		if (node == null)
            return;
 
        /* first print data of node */
        node.printData();
 
        /* then recur on left subtree */
        printPreorder(node.getLeftNode());
 
        /* now recur on right subtree */
        printPreorder(node.getRightNode());
	}
	
	public void printPreorder() {
		printPreorder(root);
	}

}
