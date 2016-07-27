package com.yelbosh.algorithm.sort.quicksort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.ArrayUtil;
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
		partitionsort(s, 0, 9);
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
	
	
	//////////////////////////////////////////////////////////////////////////
	
	//��һ�֣�partion��quciksort����������
	public static int partition(int[] a, int left, int right){
		int i=left, j=right+1;
		do {
			do i++; while(a[i]<a[left]);
			do j--; while(a[j]>a[left]);
			if(i<j) ArrayUtil.swap(a, i, j);
		}while(i<j);
		ArrayUtil.swap(a, left, j);
		return j;
	}
	
	//����partition�Ľ�����ж��ֵݹ�
	public static void partitionsort(int[] a, int left, int right){
		if(left < right){
			int j = partition(a, left, right);
			partitionsort(a, left, j);
			partitionsort(a, j+1, right);
		}
	}
	
	//�ҳ���kСԪ��
	public static int findKMin(int[] a, int n, int k){
		if(n<=0 || k>n ||k<0){
			return -1;
		}
		int left = 0; int right = n;
		do{
			int j = (int)(Math.random()*(right-left+1)+left);
			ArrayUtil.swap(a, left, j);
			j = partition(a, left, right);
			if(k==j+1) {return a[k];}
			else if(k<j+1) right=j;
			else left=j+1;
		}while(true);
	}

}
