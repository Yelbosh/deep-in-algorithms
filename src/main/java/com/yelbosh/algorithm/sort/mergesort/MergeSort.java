package com.yelbosh.algorithm.sort.mergesort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * 归并排序，和快排一样，也是分治思想来做的，整体就是，先划分，在合并。
 * divide and conquered思想运用典例
 * 时间复杂度 nlogn
 * 稳定排序算法
 * @author Yabo
 *
 */
public class MergeSort {
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		int[] tmp = new int[10];
		logger.info("要排序的数组："+Arrays.toString(s));
		mergesort(s, 2, 8, tmp);
		logger.info("排序后的数组："+Arrays.toString(s));
	}
	
	//merge的demo：将a和b合并到tmp中去，a和b可能尚未排序
	public static void merge(int[] a, int m, int[] b, int n, int[] tmp){
		int i,j,k;
		i=j=k=0;
		
		while(i<m && j<n){
			if(a[i]<b[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = b[j++];
		}
		while(i<m)
			tmp[k++] = a[i++];
		while(j<n)
			tmp[k++] = b[j++];
	}
	
	//归并排序的第一步：mergesort操作
	/**
	 * 将数组进行conquered并且merge,可以用来只对数组的某一部分进行排序
	 * @param a 数组		
	 * @param first 开始下标
	 * @param last 结束下标
	 * @param tmp 临时数组
	 */
	public static void mergesort(int[] a, int first, int last, int[] tmp){
		if(first < last){
			int middle = (first + last)/2;
			mergesort(a, first, middle, tmp);
			mergesort(a, middle+1, last, tmp);
			mergearray(a, first, middle, last, tmp);
		}
	}
	
	//将两个数组进行merge，和demo很相似
	public static void mergearray(int[] a, int first, int middle, int last, int[] tmp){
		int i,j,k;
		i=first;j=middle+1;k=0;
		int m = middle; int n=last;
		while(i<=m && j<=n){
			if(a[i]<a[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = a[j++];
		}
		while(i<=m)
			tmp[k++] = a[i++];
		while(j<=n)
			tmp[k++] = a[j++];
		//将tmp中排好序的复制到a中
		for(i=0;i<k;i++){
			a[first+i] = tmp[i];
		}
	}
}
