package com.yelbosh.gof.chainofresponsibility;

/**
 * ְ���ߵľ���ʵ��
 * @author Yabo
 *
 */
public class Others implements Chain{
	private Chain nextChain;
	private String responsibility = "Others"; //ְ�����

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
		System.out.println("Cannot find any people to solve this work");
	}

}
