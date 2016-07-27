package com.yelbosh.algorithm.sort.quicksort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.ArrayUtil;
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
		partitionsort(s, 0, 9);
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
	
	
	//////////////////////////////////////////////////////////////////////////
	
	//另一种，partion和quciksort的两个操作
	public static int partition(int[] a, int left, int right){
		int i=left, j=right+1;
		do {
			do i++; while(a[i]<a[left]);
			do j--; while(a[j]>a[left]);
			if(i<j) ArrayUtil.swap(a, i, j);
		}while(i<j);
		ArrayUtil.swap(a, left, j);
		return j;
	}
	
	//根据partition的结果进行二分递归
	public static void partitionsort(int[] a, int left, int right){
		if(left < right){
			int j = partition(a, left, right);
			partitionsort(a, left, j);
			partitionsort(a, j+1, right);
		}
	}
	
	//找出第k小元素
	public static int findKMin(int[] a, int n, int k){
		if(n<=0 || k>n ||k<0){
			return -1;
		}
		int left = 0; int right = n;
		do{
			int j = (int)(Math.random()*(right-left+1)+left);
			ArrayUtil.swap(a, left, j);
			j = partition(a, left, right);
			if(k==j+1) {return a[k];}
			else if(k<j+1) right=j;
			else left=j+1;
		}while(true);
	}

}
