package com.yelbosh.gof.observer;

import java.util.Vector;

/**
 * �����޸�subject���߸���subject�������Լ�
 * @author Yabo
 *
 */
public class ObserverA implements Observer {
	private Vector<String> states;
	private Subject subject;
	
	public ObserverA(Subject s){
		this.subject = s;
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
	
	//ObserverҲ����֪ͨSubject�����ı�
	public void changeState(String act, String str){
		this.subject.setState(act, str);
	}
	
	public void notifySub(){
		this.subject.sendNotify();
	}
}
