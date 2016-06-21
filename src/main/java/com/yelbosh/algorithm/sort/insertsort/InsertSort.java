package com.yelbosh.algorithm.sort.insertsort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * �������򣬺�ð�������Ǻ����Ƶģ�ֻ����ð����ÿ�ν����ֵð�������棬��������������ÿ�ν�ֵ�������ź����������
 * ʱ�临�Ӷ�n^2
 * �ȶ������㷨
 * @author Yabo
 *
 */
public class InsertSort {
	
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("Ҫ��������飺"+Arrays.toString(s));
		insertsort(s, 10);
		logger.info("���������飺"+Arrays.toString(s));
	}
	
	public static void insertsort(int[] a, int n){
		for(int i=1;i<n;i++)
			for(int j=i-1;j>=0&&a[j]>a[j+1];j--)
				ArrayUtil.swap(a, j, j+1);
	}
}
