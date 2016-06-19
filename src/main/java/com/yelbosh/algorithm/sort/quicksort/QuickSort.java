package com.yelbosh.algorithm.sort.quicksort;


/**
 * ��������
 * ʱ���½磺NlogN,ʱ���Ͻ磺N^2,ƽ��ʱ�临�Ӷȣ�NlogN
 * ���ȶ�����
 * ���������ǣ��ڿ�����+���η�������˼����������͵�һ���㷨������������ʵ��һ�������������Ĺ�����̣�����Χ�Ƹ�˼·�Կ���������һЩ��չ��
 * @author Yabo
 *
 */
public class QuickSort {
	
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
