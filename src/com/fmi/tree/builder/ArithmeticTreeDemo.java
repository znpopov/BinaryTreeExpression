package com.fmi.tree.builder;

import java.util.Scanner;
import java.util.Stack;

import com.fmi.tree.ArithmeticTreeExpression;

public class ArithmeticTreeDemo {
	
    static ArithmeticTreeBuilder addBuilder = new AdditionNodeBuilder();
    static ArithmeticTreeBuilder substrBuilder = new SubstractionNodeBuilder();
    static ArithmeticTreeBuilder multBuilder = new MultiplicationNodeBuilder();
    static ArithmeticTreeBuilder absBuilder = new AbsNodeBuilder();
    static ArithmeticTreeBuilder leafBuilder;
	
    public static void main(String[] args) {
    	TreeDirector director = new TreeDirector();
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
            	director.constructTree();
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
            director.constructTree();
            if (t == null) {
            	t = director.getTreeNode();
            	st.push(t);
            	continue;
            }
            t = director.getTreeNode();
            t1 = st.pop();      // Remove top
            t2 = st.pop();
            //  make them children
            t.setLeftNode(t2);
            t.setRightNode(t1);
            st.push(t);
        }
        t = st.peek();
        st.pop();
        scanner.close();

        System.out.println("Result2 is: " + t.process());
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
