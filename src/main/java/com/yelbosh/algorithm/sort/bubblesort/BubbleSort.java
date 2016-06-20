package com.yelbosh.algorithm.sort.bubblesort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

public class BubbleSort {
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(s));
		bubblesort_1(s, 10);
		logger.info("排序后的数组："+Arrays.toString(s));
	}
	
	//冒泡排序实现算法1
	public static void bubblesort_1(int[] s, int n){
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(s[j] > s[j+1])
					ArrayUtil.swap(s, j, j+1);
			}
		}
	}
	
	//
}
