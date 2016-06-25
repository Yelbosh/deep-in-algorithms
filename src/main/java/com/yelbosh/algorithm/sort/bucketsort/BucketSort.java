package com.yelbosh.algorithm.sort.bucketsort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class BucketSort {
	
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("要排序的数组："+Arrays.toString(s));
		bucketsort(s, 10);
	}
	
	public static void bucketsort(int[] unsorted, int maxNumber){
		int[] sorted = new int[maxNumber + 1];
        for (int i = 0; i < unsorted.length; i++)
        {
            sorted[unsorted[i]]++;
        }
        for(int i = 0; i < maxNumber+1; i++){
        	if(sorted[i] == 0) continue;
        	else{
        		for(int j=0;j<sorted[i];j++)
        			System.out.print(i + " ");
        	}
        }
	}
}
