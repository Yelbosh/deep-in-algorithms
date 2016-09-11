package com.yelbosh.java.str;

public class StringTest2 {
	public static void main(String[] args){
		String baseStr = "base";
//		final String baseFinalStr = "base";
		final String baseFinalStr = new String("base");
		//extend
		String s1 = "baseext";
		String s2 = "base" + "ext";
		String s3 = baseStr + "ext";
		String s4 = baseFinalStr + "ext";
		String s5 = new String("baseext").intern();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
	}
}
