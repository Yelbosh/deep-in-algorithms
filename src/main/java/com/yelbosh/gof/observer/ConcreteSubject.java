package com.yelbosh.gof.observer;

import java.util.Vector;

/**
 * 抽象主题类的实现
 * @author Yabo
 *
 */
public class ConcreteSubject extends Subject {
	private Vector<String> states;
	private Vector<Observer> observers;
	
	public ConcreteSubject(){
		this.states = new Vector<String>();
		this.observers = new Vector<Observer>();
	}
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
	}

	@Override
	public void sendNotify() {
		// TODO Auto-generated method stub
		for(Observer obs : this.observers){
			obs.update(this);
		}
	}

	@Override
	public Vector getState() {
		// TODO Auto-generated method stub
		return states;
	}

	@Override
	public void setState(String act, String str) {
		// TODO Auto-generated method stub
		if("ADD".equals(act)){
			this.states.add(str);
		}else if("Del".equals(act)){
			this.states.remove(str);
		}
	}

}
