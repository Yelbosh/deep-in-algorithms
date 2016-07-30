package com.yelbosh.gof.proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.operate();
	}

}
