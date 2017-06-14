package com.fmi.tree;

import java.util.Scanner;
import java.util.Stack;

import com.fmi.tree.builder.AbsNodeBuilder;
import com.fmi.tree.builder.AdditionNodeBuilder;
import com.fmi.tree.builder.ArithmeticTreeBuilder;
import com.fmi.tree.builder.ExternalNodeBuilder;
import com.fmi.tree.builder.MultiplicationNodeBuilder;
import com.fmi.tree.builder.SubstractionNodeBuilder;
import com.fmi.tree.builder.TreeDirector;
import com.fmi.tree.command.LightOffTreeCommand;
import com.fmi.tree.command.LightOnTreeCommand;
import com.fmi.tree.command.RemoteTreeControl;
import com.fmi.tree.command.TreeCommand;
import com.fmi.tree.observer.TreeSubject;
import com.fmi.tree.visitor.EvalTreeVisitor;

public class ArithmeticTreeDemo {
	
    static ArithmeticTreeBuilder addBuilder = new AdditionNodeBuilder();
    static ArithmeticTreeBuilder substrBuilder = new SubstractionNodeBuilder();
    static ArithmeticTreeBuilder multBuilder = new MultiplicationNodeBuilder();
    static ArithmeticTreeBuilder absBuilder = new AbsNodeBuilder();
    static ArithmeticTreeBuilder leafBuilder;
	
    public static void main(String[] args) {
    	TreeDirector director = new TreeDirector();
    	TreeSubject subject = new TreeSubject();
        Scanner scanner = new Scanner(System.in);
        String input;
        Stack<ArithmeticTreeExpression> st = new Stack<ArithmeticTreeExpression>();
        ArithmeticTreeExpression t = null, t1, t2;
        System.out.println("Please enter aritmetic operataion: ('+', '-', '*', 'a'), an integer"
        		+ " or other for end");
        while (true) {
            input = scanner.nextLine();
            if (isInteger(input)) {
            	leafBuilder = new ExternalNodeBuilder(Integer.parseInt(input));
            	director.setBuilder(leafBuilder);
            	director.constructTree(subject);
            	t = director.getTreeNode();
            	st.push(t);
            	continue;
            } else if ("+".equals(input)) {
            	director.setBuilder(addBuilder);
            } else if ("-".equals(input)) {
            	director.setBuilder(substrBuilder);
            } else if ("*".equals(input)) {
            	director.setBuilder(multBuilder);
            } else if ("a".equals(input)) {
            	director.setBuilder(absBuilder);
            } else {
            	break;
            }
            director.constructTree(subject);
            if (t == null) {
            	t = director.getTreeNode();
            	st.push(t);
            	continue;
            }
            t = director.getTreeNode();
            t1 = st.pop();      // Remove top
            t2 = st.pop();
            //  make them children
            t.setLeftNode(t1);
            t.setRightNode(t2);
            st.push(t);
        }
        t = st.peek();
        st.pop();
        scanner.close();
        
        RemoteTreeControl control = new RemoteTreeControl();

        TreeCommand lightsOn = new LightOnTreeCommand(t);

        TreeCommand lightsOff = new LightOffTreeCommand(t);

        //switch on

        control.setCommand(lightsOn);
        control.pressButton();
        printPreorder(t);
        //switch off

        control.setCommand(lightsOff);
        control.pressButton();
        printPreorder(t);
        EvalTreeVisitor treeVisitor = new EvalTreeVisitor();
        System.out.println("With visitor result is: " + t.accept(treeVisitor));
        System.out.println("Result is: " + t.process());
        subject.setState(5);
        System.out.println("New result is: " + t.process());
    }
    
	private static void printPreorder(ArithmeticTreeExpression node) {
		if (node == null)
            return;
 
        /* first print data of node */
        node.printData();
 
        /* then recur on left subtree */
        printPreorder(node.getLeftNode());
 
        /* now recur on right subtree */
        printPreorder(node.getRightNode());
	}
    
    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
