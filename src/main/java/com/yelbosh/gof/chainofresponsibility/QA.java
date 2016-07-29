package com.yelbosh.gof.chainofresponsibility;

/**
 * ְ���ߵľ���ʵ��
 * @author Yabo
 *
 */
public class QA implements Chain{
	private Chain nextChain;
	private String responsibility = "Test"; //ְ�����

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
			System.out.println("A QA ---> Test");
		}else{
			Chain next = this.getChain();
			if(next != null){
				next.sendToChain(msg);
			}
		}
	}

}
