package com.yelbosh.algorithm.sort.heapsort;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

public class HeapSort {
	
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(QuickSort.class);
		int[] a = {8,9,5,1,8,6,3,4,2,0};
		logger.info("Ҫ��������飺"+Arrays.toString(a));
		MakeMinHeap(a);
		logger.info("�������С�ѣ�"+Arrays.toString(a));
		MinHeapAddNum(a,7);
		MinHeapDeleteNum(a);
		MinHeapToDescentArr(a);
		logger.info("���������� ��"+Arrays.toString(a));
	}
	
	//�������ϵ�����С�ѣ��¼����i�ڵ�
	//ֻ�豣֤��i�ڵ㵽����ڵ���һ�������·������
	public static void MinHeapFixUp(int[] a, int i){
		int j, temp;
		j = (i-1) / 2;
		temp = a[i];
		
		while((j>=0) && (i!=0)){
			if(a[j] <= temp)
				break;
			a[i] = a[j];
			i = j;
			j = (i-1) / 2;
		}
		a[i] = temp;
	}
	
	//�������µ�����С�ѣ���i�ڵ㿪ʼ����
	//�ҳ�i�ڵ���С�ĺ��ӣ�����i����ֱ��Ҷ�Ӳ�
	public static void MinHeapFixDown(int[] a, int i, int n){
		int j, temp;
		temp = a[i];
		j = i*2 + 1;
		while(j<n){
			if((j+1<n) && (a[j+1]<a[j]))
				j++;
			if(a[j] >= temp)
				break;
			a[i] = a[j];
			i = j;
			j = i*2 + 1;
		}
		a[i] = temp;
	}
	
	//����С���м����½ڵ�
	//ֱ�Ӽӵ�����ĩβȻ��fixup
	public static void MinHeapAddNum(int[] a, int num){
		int lenth = a.length;
		a[lenth-1] = num;
		MinHeapFixUp(a, lenth-1);
	}
	
	//ɾ����С�ѵĸ��ڵ�
	//������Ԫ�غ͸��ڵ�swap����fixdown
	public static void MinHeapDeleteNum(int[] a){
		int lenth = a.length;
		ArrayUtil.swap(a, 0, lenth-1);
		MinHeapFixDown(a, 0, lenth-1);
	}
	
	//�������鹹����С��
	public static void MakeMinHeap(int[] a){
		int lenth = a.length;
		for(int i=lenth/2-1;i>=0;i--){
			MinHeapFixDown(a, i, lenth);
		}
			
	}
	
	//������С�ѹ�����������
	public static void MinHeapToDescentArr(int[] a){
		int lenth = a.length;
		for(int i=lenth-1;i>0;i--){
			ArrayUtil.swap(a, 0, i);
			MinHeapFixDown(a, 0, i);
		}
	}
	
}
