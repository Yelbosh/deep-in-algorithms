package com.yelbosh.algorithm.bit;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class CCBitMani {
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(CCBitMani.class);
		int result = bit1number(14562);
		logger.info("�������н����"+result);
	}
		
	//����������������1�ĸ���
	public static int bit1number(int n){
		int result = 0;
		while(n != 0){
			result  += 1;
			n = (n-1)&n;
		}
		return result;
	}
}
