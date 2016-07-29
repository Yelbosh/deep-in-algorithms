package com.yelbosh.gof.singleton;

/**
 * 使用内部类的饿汉模式，来做到lazy loading
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
