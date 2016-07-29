package com.yelbosh.gof.decorator;

/**
 * 装饰者的具体实现
 * @author Yabo
 *
 */
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	//在实现中可以对方法进行复写
	public void printStr(String s){
		component.printStr(s);
		System.out.println("This is printed by concrete decorator A");
	}
	
	//装饰者模式对原类进行的一个扩展
	public void printStr2(String s){
		System.out.println("I miss u so much autumn!");
	}
	
}
