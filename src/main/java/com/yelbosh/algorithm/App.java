package com.yelbosh.algorithm;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.yelbosh.algorithm.sort.bubblesort.BubbleSort;
import com.yelbosh.algorithm.sort.mergesort.MergeSort;
import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * ������Ե�����
 *
 */
public class App 
{
	//������ڣ����ڸô����д�����ԣ�ֻ�ڸô������㷨�������һ���ӿ�
    public static void main( String[] args )
    {
    	long starTime = System.currentTimeMillis();
    	MergeSort.test();
    	long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
    	System.out.println(time);
    }
}
