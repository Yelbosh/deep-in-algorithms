package com.yelbosh.gof.singleton;

/**
 * 饿汉模式，在类加载的时候进行初始化，无法做到lazy loading
 * @author Yabo
 *
 */
public class HungrySingleton {
	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton(){}

	public static HungrySingleton getInstance(){
		if(instance == null)
			return new HungrySingleton();
		return instance;
	}
	
}
