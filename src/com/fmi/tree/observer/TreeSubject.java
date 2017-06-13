package com.fmi.tree.observer;

import java.util.ArrayList;
import java.util.List;

public class TreeSubject {
	
	private List<TreeObserver> treeObservers = new ArrayList<TreeObserver>();
	private int state;
	
	public int getState() {
		return state;
	}

    public void setState(int state) {
    	this.state = state;
    	notifyAllObservers();
    }

    public void attach(TreeObserver treeObserver) {
    	treeObservers.add(treeObserver);		
    }

    public void notifyAllObservers() {
    	for (TreeObserver treeObserver : treeObservers) {
    		treeObserver.update();
    	}
    } 

}
