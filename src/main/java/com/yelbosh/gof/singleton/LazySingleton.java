package com.yelbosh.gof.singleton;

/**
 * ֮����������������Ϊ������ʵ�ַ�ʽ����lazy loading��
 * @author Yabo
 *
 */
public class LazySingleton {
	private static LazySingleton instance;
	
	private LazySingleton(){}
	
//	// �̲߳���ȫ
//	public static LazySingleton getInstance(){
//		if(instance == null)
//			return new LazySingleton();
//		return instance;
//	}
	
	//�̰߳�ȫ
	public synchronized static LazySingleton getInstance(){
		if(instance == null)
			return new LazySingleton();
		return instance;
	}
}
