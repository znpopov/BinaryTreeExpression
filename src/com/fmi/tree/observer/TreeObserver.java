package com.fmi.tree.observer;

public abstract class TreeObserver {
	
	protected TreeSubject treeSubject;
	
	public abstract void update();

}
