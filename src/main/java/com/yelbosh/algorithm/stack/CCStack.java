package com.yelbosh.algorithm.stack;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.string.StringSub;
import com.yelbosh.algorithm.util.LoggerUtil;

public class CCStack {
	
	public static void test(){
		Logger logger = LoggerUtil.getLogger(CCStack.class);
		hannoi(3,'A','B','C');
	}
	
	/*3.2 实现栈的min操作*/
	
	/*3.3 汉诺以塔递归*/
	public static void hannoi(int n, char src, char mid, char dst){
		if(n == 1){
			System.out.println("Move disk "+n+" from "+src+" to "+dst);
		}else{
			hannoi(n-1, src, dst, mid);
			System.out.println("Move disk "+n+" from "+src+" to "+dst);
			hannoi(n-1, mid, src, dst);
		}
	}
}
