package com.yelbosh.gof.observer;

import java.util.Vector;

/*
 * ��������
 */
public abstract class Subject {
	public abstract void attach(Observer observer); //���ӹ۲����б�
	public abstract void detach(Observer observer); //ɾ���۲����б�
	public abstract void sendNotify(); //����֪ͨ
	
	public abstract Vector getState(); //��ȡ״̬���۲��ߺ�����ά��һ�µ�״̬
	public abstract void setState(String act, String str); //����״̬
	
}
