package com.yelbosh.gof.decorator;

/**
 * 装饰者父类
 * @author Yabo
 *
 */
public class Decorator {
	protected Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	//按道理需要把component中的方法重写一遍并进行对象调用
	public void printStr(String s){
		component.printStr(s);
	}
}
