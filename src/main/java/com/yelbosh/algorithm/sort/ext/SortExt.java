package com.yelbosh.algorithm.sort.ext;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class SortExt { //和排序相关的一些问题
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(SortExt.class);
		int[] s = {3,4,5,6,9,0,1,2};
		logger.info("要排序的数组："+Arrays.toString(s));
		int result = rotateSortedMin(s);
		logger.info("运行结果："+result);
	}
		
	
	/**
	 * 寻找旋转排序数组的最小值，二分查找的思想
	 * @return
	 */
	public static int rotateSortedMin(int[] a){
		int l,r,middle;
		l=0;r=a.length-1;
		if(a[l]<a[r])
			return a[l];
		while(l<r){ //二分查找思想
			middle = (l+r)/2;
			if(a[middle]>a[r])
				l = middle + 1;
			else
				r = middle;
		}
		return a[l];
	}
	
}
