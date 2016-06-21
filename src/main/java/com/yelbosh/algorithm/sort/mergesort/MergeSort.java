package com.yelbosh.algorithm.sort.mergesort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * �鲢���򣬺Ϳ���һ����Ҳ�Ƿ���˼�������ģ�������ǣ��Ȼ��֣��ںϲ���
 * divide and conquered˼�����õ���
 * ʱ�临�Ӷ� nlogn
 * �ȶ������㷨
 * @author Yabo
 *
 */
public class MergeSort {
	
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] s = {8,9,5,1,8,6,3,4,2,0};
		int[] tmp = new int[10];
		logger.info("Ҫ��������飺"+Arrays.toString(s));
		mergesort(s, 2, 8, tmp);
		logger.info("���������飺"+Arrays.toString(s));
	}
	
	//merge��demo����a��b�ϲ���tmp��ȥ��a��b������δ����
	public static void merge(int[] a, int m, int[] b, int n, int[] tmp){
		int i,j,k;
		i=j=k=0;
		
		while(i<m && j<n){
			if(a[i]<b[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = b[j++];
		}
		while(i<m)
			tmp[k++] = a[i++];
		while(j<n)
			tmp[k++] = b[j++];
	}
	
	//�鲢����ĵ�һ����mergesort����
	/**
	 * ���������conquered����merge,��������ֻ�������ĳһ���ֽ�������
	 * @param a ����		
	 * @param first ��ʼ�±�
	 * @param last �����±�
	 * @param tmp ��ʱ����
	 */
	public static void mergesort(int[] a, int first, int last, int[] tmp){
		if(first < last){
			int middle = (first + last)/2;
			mergesort(a, first, middle, tmp);
			mergesort(a, middle+1, last, tmp);
			mergearray(a, first, middle, last, tmp);
		}
	}
	
	//�������������merge����demo������
	public static void mergearray(int[] a, int first, int middle, int last, int[] tmp){
		int i,j,k;
		i=first;j=middle+1;k=0;
		int m = middle; int n=last;
		while(i<=m && j<=n){
			if(a[i]<a[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = a[j++];
		}
		while(i<=m)
			tmp[k++] = a[i++];
		while(j<=n)
			tmp[k++] = a[j++];
		//��tmp���ź���ĸ��Ƶ�a��
		for(i=0;i<k;i++){
			a[first+i] = tmp[i];
		}
	}
}
