package com.yelbosh.gof.decorator;

/**
 * װ���ߵľ���ʵ��
 * @author Yabo
 *
 */
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	//��ʵ���п��ԶԷ������и�д
	public void printStr(String s){
		component.printStr(s);
		System.out.println("This is printed by concrete decorator A");
	}
	
	//װ����ģʽ��ԭ����е�һ����չ
	public void printStr2(String s){
		System.out.println("I miss u so much autumn!");
	}
	
}
