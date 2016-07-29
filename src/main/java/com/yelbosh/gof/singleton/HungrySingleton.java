package com.yelbosh.gof.singleton;

/**
 * ����ģʽ��������ص�ʱ����г�ʼ�����޷�����lazy loading
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
