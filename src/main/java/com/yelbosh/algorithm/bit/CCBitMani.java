package com.yelbosh.algorithm.bit;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class CCBitMani {
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(CCBitMani.class);
		int result = bit1number(14562);
		logger.info("程序运行结果："+result);
	}
		
	//返回整数二进制中1的个数
	public static int bit1number(int n){
		int result = 0;
		while(n != 0){
			result  += 1;
			n = (n-1)&n;
		}
		return result;
	}
}
