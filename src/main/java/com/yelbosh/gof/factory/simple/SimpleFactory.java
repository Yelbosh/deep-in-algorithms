package com.yelbosh.gof.factory.simple;

public class SimpleFactory {
	public Window createWindow(String type){
		if("big".equals(type)){
			return new WindowBig();
		}else if("small".equals(type)){
			return new WindowSmall();
		}else
			return new WindowBig();
	}
	
	public static void main(String[] args){
		SimpleFactory factory = new SimpleFactory();
		Window small = factory.createWindow("small");
		small.func();
		
		Window big = factory.createWindow("big");
		big.func();
	}
}
