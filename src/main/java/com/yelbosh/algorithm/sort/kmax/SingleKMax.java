package com.yelbosh.algorithm.sort.kmax;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * 使用partition函数寻找第k大元素
 * @author Yabo
 *
 */
public class SingleKMax {
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(s));
		int k = 5;
		int kmax = findKMax(s, k);
		logger.info("第"+k+"小的元素是"+kmax);
	}
	
	//partition函数
	public static int partition(int[] a, int left, int right){
		int i=left; int j=right+1;
		do{
			do{ i++; }while(a[i]<a[left]);
			do{ j--; }while(a[j]>a[left]);
			if(i<j) ArrayUtil.swap(a, i, j);
		}while(i<j);
		ArrayUtil.swap(a, left, j);
		return j;
	}
	
	//寻找第k小元素
	public static int findKMax(int[] a, int k){
		int start = 0; int end = a.length-1;
		int partition = -2;
		while(true){
			partition = partition(a, start, end);
			if(k == (partition+1))
				break;
			else if(k < (partition+1)){
				end = partition;
			}else{
				start = partition + 1;
			}
		}
		return a[partition];
	}
}
