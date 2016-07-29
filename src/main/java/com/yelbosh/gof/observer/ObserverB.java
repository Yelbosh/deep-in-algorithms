package com.yelbosh.gof.observer;

import java.util.Vector;

/**
 * 只能根据Subject来更新自己，不能修改subject
 * @author Yabo
 *
 */
public class ObserverB implements Observer {
	private Vector<String> states;
	
	public ObserverB(){
		this.states = new Vector<String>();
	}
	
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		this.states = subject.getState();
		System.out.println("----- ObserverA will be updated -----");
        for(int i = 0; i < states.size(); i++) {
            System.out.println("Num " + i + " is :" + (String)states.get(i));
        }
	}
}
