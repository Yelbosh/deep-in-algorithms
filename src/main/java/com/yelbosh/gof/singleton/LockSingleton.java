package com.yelbosh.gof.singleton;

public class LockSingleton {
	private static volatile LockSingleton instance;
	
	private LockSingleton(){}
	
	public static LockSingleton getInstance(){
		if(instance == null){
			synchronized(LockSingleton.class){ //只有在instance为null的情况下才会上锁，效率会提升
				if(instance == null)
					instance = new LockSingleton();
			}
		}
		return instance;
	}
}
