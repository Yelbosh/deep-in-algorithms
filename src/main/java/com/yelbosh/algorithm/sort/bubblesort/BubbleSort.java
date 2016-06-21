package com.yelbosh.algorithm.sort.bubblesort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * 冒泡排序，每次都冒出一个最大的到最右边，如果某一趟中没有发生swap，则表明排序已完成
 * @author Yabo
 * 时间复杂度：n^2
 * 稳定排序算法
 *
 */
public class BubbleSort {
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(s));
		bubblesort_3(s, 10);
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
	
	//冒泡排序实现算法优化1-添加flag标志
	public static void bubblesort_2(int[] s, int n){
		boolean flag = true;
		for(int i=n-1;i>0;i--){
			flag = false;
			for(int j=0;j<i;j++){
				if(s[j] > s[j+1])
					ArrayUtil.swap(s, j, j+1);
					flag = true;
			}
			if(!flag) break; //标志位为true则结束
		}
	}
	
	//冒泡排序实现算法优化2-记录中间交换的位置，下次直接遍历至此处即可
	public static void bubblesort_3(int[] s, int n){
		int i,j;
		int flag = n;
		
		while(flag > 0){
			i = flag;
			flag = 0;
			for(j=1;j<i;j++){
				if(s[j-1]>s[j]){
					ArrayUtil.swap(s, j-1, j);
					flag = j;
				}
			}
		}
	}
	
}
