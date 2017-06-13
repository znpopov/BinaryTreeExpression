package com.fmi.tree.command;

import com.fmi.tree.ArithmeticTreeExpression;

public class LightOffTreeCommand implements TreeCommand {
	ArithmeticTreeExpression treeLight;

	public LightOffTreeCommand(ArithmeticTreeExpression treeLight) {
		this.treeLight = treeLight;
	}

	public void execute() {
		treeLight.switchOff();
	}
}
