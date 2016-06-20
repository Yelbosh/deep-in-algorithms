package com.yelbosh.algorithm.sort.quicksort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;


/**
 * ��������
 * ʱ���½磺NlogN,ʱ���Ͻ磺N^2,ƽ��ʱ�临�Ӷȣ�NlogN
 * ���ȶ�����
 * ���������ǣ��ڿ�����+���η�������˼����������͵�һ���㷨������������ʵ��һ�������������Ĺ�����̣�����Χ�Ƹ�˼·�Կ���������һЩ��չ��
 * @author Yabo
 *
 */
public class QuickSort {
	
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		logger.info("Ҫ��������飺"+Arrays.toString(s));
		quicksort(s, 0, 9);
		logger.info("���������飺"+Arrays.toString(s));
	}
	
	//�㷨ʵ��
	public static void quicksort(int[] s, int l, int r){
		if(l<r){
			int i=l, j=r, x=s[l];
			while(i<j){
				while(i<j && x<=s[j]) //��������Ѱ�ҵ�һ��С�������ֵ
					j--;
				if(i<j)
					s[i++] = s[j];
				while(i<j && x>=s[i]) //�������ң�Ѱ�ҵ�һ�����������ֵ
					i++;
				if(i<j)
					s[j--] = s[i];
			}
			s[i] = x;  
			quicksort(s, l, i - 1); // �ݹ����   
			quicksort(s, i + 1, r);  
		}
	}

}
