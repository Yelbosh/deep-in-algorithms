package com.yelbosh.java.tryfinal;

import java.io.IOException;

public class FinallyTest {
	
	//��try��catch��������return��䣬����Ȱ�Ҫreturn�ı������棬����ִ��finally��䣬ִ����finally��֮�����û��return���ٰѱ����returnֵ���أ����������return���ֱ��return��
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
