package com.yelbosh.gof.singleton;

/**
 * 之所以是懒汉，是因为这样的实现方式都是lazy loading的
 * @author Yabo
 *
 */
public class LazySingleton {
	private static LazySingleton instance;
	
	private LazySingleton(){}
	
//	// 线程不安全
//	public static LazySingleton getInstance(){
//		if(instance == null)
//			return new LazySingleton();
//		return instance;
//	}
	
	//线程安全
	public synchronized static LazySingleton getInstance(){
		if(instance == null)
			return new LazySingleton();
		return instance;
	}
}
