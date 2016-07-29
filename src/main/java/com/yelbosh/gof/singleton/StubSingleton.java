package com.yelbosh.gof.singleton;

/**
 * ʹ���ڲ���Ķ���ģʽ��������lazy loading
 * @author Yabo
 *
 */
public class StubSingleton {
	private static class Stub{
		private static final StubSingleton INSTANCE = new StubSingleton();
	}
	
	private StubSingleton(){}
	
	public static StubSingleton getInstance(){
		return Stub.INSTANCE;
	}
	
	public void func(){
		System.out.println("I am a stub singleton");
	}
}
