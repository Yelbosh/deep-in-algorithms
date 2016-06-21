package com.yelbosh.algorithm.util;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;

public class ArrayUtil {
	
	//������ڣ���main�е��ø÷���
		public static void test(){
			Logger logger = LoggerUtil.getLogger(QuickSort.class);
			int[] s = {8,9,5,1,8,6,3,4,2,0};
			logger.info("����ǰ�����飺"+Arrays.toString(s));
			swap(s, 0, 9);
			logger.info("���Ժ�����飺"+Arrays.toString(s));
		}
	
	//���������е�����Ԫ��
	public static void swap(int[] s, int i, int j){
		int tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}
}
