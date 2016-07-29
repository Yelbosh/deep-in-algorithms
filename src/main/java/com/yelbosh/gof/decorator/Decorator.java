package com.yelbosh.gof.decorator;

/**
 * װ���߸���
 * @author Yabo
 *
 */
public class Decorator {
	protected Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	//��������Ҫ��component�еķ�����дһ�鲢���ж������
	public void printStr(String s){
		component.printStr(s);
	}
}
