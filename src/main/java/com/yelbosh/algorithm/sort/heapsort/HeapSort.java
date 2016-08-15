package com.yelbosh.algorithm.sort.heapsort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

public class HeapSort {
	
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] a = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(a));
		MakeMinHeap(a);
		logger.info("构造的最小堆："+Arrays.toString(a));
		MinHeapAddNum(a,7);
		MinHeapDeleteNum(a);
		MinHeapToDescentArr(a);
		logger.info("排序后的数组 ："+Arrays.toString(a));
	}
	
	//从下向上调整最小堆，新加入的i节点
	//只需保证从i节点到其根节点是一条有序的路径即可
	public static void MinHeapFixUp(int[] a, int i){
		int j, temp;
		j = (i-1) / 2;
		temp = a[i];
		
		while((j>=0) && (i!=0)){
			if(a[j] <= temp)
				break;
			a[i] = a[j];
			i = j;
			j = (i-1) / 2;
		}
		a[i] = temp;
	}
	
	//从上向下调整最小堆，从i节点开始调整
	//找出i节点最小的孩子，并和i交换直到叶子层
	public static void MinHeapFixDown(int[] a, int i, int n){
		int j, temp;
		temp = a[i];
		j = i*2 + 1;
		while(j<n){
			if((j+1<n) && (a[j+1]<a[j]))
				j++;
			if(a[j] >= temp)
				break;
			a[i] = a[j];
			i = j;
			j = i*2 + 1;
		}
		a[i] = temp;
	}
	
	//向最小堆中加入新节点
	//直接加到数组末尾然后fixup
	public static void MinHeapAddNum(int[] a, int num){
		int lenth = a.length;
		a[lenth-1] = num;
		MinHeapFixUp(a, lenth-1);
	}
	
	//删除最小堆的根节点
	//将最后的元素和根节点swap，并fixdown
	public static void MinHeapDeleteNum(int[] a){
		int lenth = a.length;
		ArrayUtil.swap(a, 0, lenth-1);
		MinHeapFixDown(a, 0, lenth-1);
	}
	
	//利用数组构造最小堆
	public static void MakeMinHeap(int[] a){
		int lenth = a.length;
		for(int i=lenth/2-1;i>=0;i--){
			MinHeapFixDown(a, i, lenth);
		}
			
	}
	
	//利用最小堆构建降序数组
	public static void MinHeapToDescentArr(int[] a){
		int lenth = a.length;
		for(int i=lenth-1;i>0;i--){
			ArrayUtil.swap(a, 0, i);
			MinHeapFixDown(a, 0, i);
		}
	}
	
}
