package com.yelbosh.java.tryfinal;

import java.io.IOException;

public class FinallyTest {
	
	//在try和catch中遇到了return语句，则会先把要return的变量保存，接着执行finally语句，执行完finally块之后如果没有return则再把保存的return值返回，如果遇到了return则就直接return了
	public static int finalTest(int b){
		try{
			b += 10;
			return b;
		}catch(RuntimeException e){
			b += 5;
			return b;
		}catch(Exception e){
			b += 6;
			return b;
		}finally{
			b += 10;
			System.out.println(b);
//			return b;
		}
	}
	
	public static void main(String[] args){
		int num = 0;
		System.out.println(finalTest(num));
	}
}
