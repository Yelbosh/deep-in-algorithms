package com.yelbosh.gof.singleton;

public class LockSingleton {
	private static volatile LockSingleton instance;
	
	private LockSingleton(){}
	
	public static LockSingleton getInstance(){
		if(instance == null){
			synchronized(LockSingleton.class){ //ֻ����instanceΪnull������²Ż�������Ч�ʻ�����
				if(instance == null)
					instance = new LockSingleton();
			}
		}
		return instance;
	}
}
