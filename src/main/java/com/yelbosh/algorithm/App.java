package com.yelbosh.algorithm;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.yelbosh.algorithm.sort.bubblesort.BubbleSort;
import com.yelbosh.algorithm.sort.mergesort.MergeSort;
import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * 程序测试的主类
 *
 */
public class App 
{
	//测试入口，请在该处进行代码测试，只在该处调用算法类的其中一个接口
    public static void main( String[] args )
    {
    	long starTime = System.currentTimeMillis();
    	MergeSort.test();
    	long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
    	System.out.println(time);
    }
}
