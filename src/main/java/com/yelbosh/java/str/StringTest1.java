package com.yelbosh.java.str;

/**
 * ÅÐ¶Ï×Ö·û´®µÄÏàµÈ
 * @author Yabo
 *
 */
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello world";
		String s2 = new String("hello world");
		String s3 = s2.intern();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3); 
	}

}
