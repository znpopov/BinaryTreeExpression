package com.fmi.tree.command;

import com.fmi.tree.ArithmeticTreeExpression;

public class LightOnTreeCommand implements TreeCommand {
	ArithmeticTreeExpression treeLight;

	public LightOnTreeCommand(ArithmeticTreeExpression treeLight) {
		this.treeLight = treeLight;
	}

	public void execute() {
		treeLight.switchOn();
	}

}
