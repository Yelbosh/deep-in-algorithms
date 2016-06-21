package com.yelbosh.algorithm.sort.insertsort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * 插入排序，和冒泡排序是很类似的，只不过冒泡是每次将最大值冒到最上面，而插入排序则是每次将值插入已排好序的数组中
 * 时间复杂度n^2
 * 稳定排序算法
 * @author Yabo
 *
 */
public class InsertSort {
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(s));
		insertsort(s, 10);
		logger.info("排序后的数组："+Arrays.toString(s));
	}
	
	public static void insertsort(int[] a, int n){
		for(int i=1;i<n;i++)
			for(int j=i-1;j>=0&&a[j]>a[j+1];j--)
				ArrayUtil.swap(a, j, j+1);
	}
}
