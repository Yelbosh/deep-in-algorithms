package com.yelbosh.algorithm.sort.ext;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class SortExt { //��������ص�һЩ����
	
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(SortExt.class);
		int[] s = {3,4,5,6,9,0,1,2};
		logger.info("Ҫ��������飺"+Arrays.toString(s));
		int result = rotateSortedMin(s);
		logger.info("���н����"+result);
	}
		
	
	/**
	 * Ѱ����ת�����������Сֵ�����ֲ��ҵ�˼��
	 * @return
	 */
	public static int rotateSortedMin(int[] a){
		int l,r,middle;
		l=0;r=a.length-1;
		if(a[l]<a[r])
			return a[l];
		while(l<r){ //���ֲ���˼��
			middle = (l+r)/2;
			if(a[middle]>a[r])
				l = middle + 1;
			else
				r = middle;
		}
		return a[l];
	}
	
}
