package com.yelbosh.algorithm.sort.quicksort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;


/**
 * 快速排序
 * 时间下界：NlogN,时间上界：N^2,平均时间复杂度：NlogN
 * 不稳定排序
 * 快速排序是：挖坑填数+分治法，分治思想运用最典型的一个算法。快速排序其实是一个二叉搜索树的构造过程，可以围绕该思路对快速排序做一些扩展。
 * @author Yabo
 *
 */
public class QuickSort {
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(s));
		quicksort(s, 0, 9);
		logger.info("排序后的数组："+Arrays.toString(s));
	}
	
	//算法实现
	public static void quicksort(int[] s, int l, int r){
		if(l<r){
			int i=l, j=r, x=s[l];
			while(i<j){
				while(i<j && x<=s[j]) //从右向左，寻找第一个小于中枢的值
					j--;
				if(i<j)
					s[i++] = s[j];
				while(i<j && x>=s[i]) //从左向右，寻找第一个大于中枢的值
					i++;
				if(i<j)
					s[j--] = s[i];
			}
			s[i] = x;  
			quicksort(s, l, i - 1); // 递归调用   
			quicksort(s, i + 1, r);  
		}
	}

}
