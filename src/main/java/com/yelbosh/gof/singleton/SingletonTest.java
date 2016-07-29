package com.yelbosh.gof.singleton;

public class SingletonTest {
	public static void main(String[] args){
		StubSingleton instance = StubSingleton.getInstance();
		instance.func();
	}
}
