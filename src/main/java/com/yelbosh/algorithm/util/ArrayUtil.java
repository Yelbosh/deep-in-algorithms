package com.yelbosh.algorithm.util;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;

public class ArrayUtil {
	
	//测试入口，在main中调用该方法
		public static void test(){
			Logger logger = LoggerUtil.getLogger(QuickSort.class);
			int[] s = {8,9,5,1,8,6,3,4,2,0};
			logger.info("测试前的数组："+Arrays.toString(s));
			swap(s, 0, 9);
			logger.info("测试后的数组："+Arrays.toString(s));
		}
	
	//交换数组中的两个元素
	public static void swap(int[] s, int i, int j){
		int tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}
}
