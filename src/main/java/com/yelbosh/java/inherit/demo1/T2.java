package com.yelbosh.java.inherit.demo1;

public class T2 extends T1{
	int i = 2;
	
	public void test1(){
		System.out.println(i);
	}
	
	public void test2(){
		System.out.println(i);
	}
	
	public static void main(String[] args){
		T1 test = new T2();
		test.test1();
		((T2)test).test2();
		System.out.println(test.i);
		test = (T2)test;
		test.test1();
		System.out.println(test.i);
	}
}
