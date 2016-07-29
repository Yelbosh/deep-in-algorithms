package com.yelbosh.gof.chainofresponsibility;

public class ChainTest {
	public static void main(String[] args){
		Manager manager = new Manager();
		PM pm = new PM();
		Programmer programmer = new Programmer();
		QA qa = new QA();
		Others others = new Others();
		manager.addChain(pm);pm.addChain(programmer);programmer.addChain(qa);qa.addChain(others);
		
		//发送职责消息
		manager.sendToChain("Get Project");
		manager.sendToChain("Design");
		manager.sendToChain("Code");
		manager.sendToChain("Test");
		manager.sendToChain("Kiss me");
	}
}
