package com.yelbosh.gof.proxy;

public class Proxy implements Subject {
	private Subject subject;
	
	public Proxy(Subject subject) {
        this.subject = subject;
    }

	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("before operate......");
        subject.operate();
        System.out.println("after operate......");
	}
	
	
}	
