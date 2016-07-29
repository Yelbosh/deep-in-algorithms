package com.yelbosh.gof.factory.method;

public class FactoryMethod {
	public static void main(String[] args){
		Factory fac1 = new WindowBigFactory();
		Window win1 = fac1.makeWindow(); win1.func();
		Window win2 = fac1.makeWindow(); win2.func();
		
		Factory fac2 = new WindowSmallFactory();
		Window win3 = fac2.makeWindow(); win3.func();
		Window win4 = fac2.makeWindow(); win4.func();
	}
}
