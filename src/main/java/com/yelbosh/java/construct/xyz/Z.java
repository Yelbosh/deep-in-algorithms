package com.yelbosh.java.construct.xyz;

public class Z extends X {
	Y y = new Y();
	
	Z(){
		System.out.println("Z");
	}
	
	public static void main(String[] args){
		Z z = new Z();
	}
}
