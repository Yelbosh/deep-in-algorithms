package com.yelbosh.gof.chainofresponsibility;

/**
 * 职责者的具体实现
 * @author Yabo
 *
 */
public class Programmer implements Chain{
	private Chain nextChain;
	private String responsibility = "Code"; //职责表述

	public void addChain(Chain chain) {
		// TODO Auto-generated method stub
		this.nextChain = chain;
	}

	public Chain getChain() {
		// TODO Auto-generated method stub
		return nextChain;
	}

	public void sendToChain(String msg) {
		// TODO Auto-generated method stub
		if(msg.equals(responsibility)){
			System.out.println("A Programmer ---> Code");
		}else{
			Chain next = this.getChain();
			if(next != null){
				next.sendToChain(msg);
			}
		}
	}

}
