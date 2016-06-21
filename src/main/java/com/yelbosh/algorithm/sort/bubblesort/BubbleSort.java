package com.yelbosh.algorithm.sort.bubblesort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * ð������ÿ�ζ�ð��һ�����ĵ����ұߣ����ĳһ����û�з���swap����������������
 * @author Yabo
 * ʱ�临�Ӷȣ�n^2
 * �ȶ������㷨
 *
 */
public class BubbleSort {
	
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("Ҫ��������飺"+Arrays.toString(s));
		bubblesort_3(s, 10);
		logger.info("���������飺"+Arrays.toString(s));
	}
	
	//ð������ʵ���㷨1
	public static void bubblesort_1(int[] s, int n){
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(s[j] > s[j+1])
					ArrayUtil.swap(s, j, j+1);
			}
		}
	}
	
	//ð������ʵ���㷨�Ż�1-���flag��־
	public static void bubblesort_2(int[] s, int n){
		boolean flag = true;
		for(int i=n-1;i>0;i--){
			flag = false;
			for(int j=0;j<i;j++){
				if(s[j] > s[j+1])
					ArrayUtil.swap(s, j, j+1);
					flag = true;
			}
			if(!flag) break; //��־λΪtrue�����
		}
	}
	
	//ð������ʵ���㷨�Ż�2-��¼�м佻����λ�ã��´�ֱ�ӱ������˴�����
	public static void bubblesort_3(int[] s, int n){
		int i,j;
		int flag = n;
		
		while(flag > 0){
			i = flag;
			flag = 0;
			for(j=1;j<i;j++){
				if(s[j-1]>s[j]){
					ArrayUtil.swap(s, j-1, j);
					flag = j;
				}
			}
		}
	}
	
}
