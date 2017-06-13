package com.fmi.tree.command;

public class RemoteTreeControl {
	
	private TreeCommand command;

	public void setCommand(TreeCommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}

}
