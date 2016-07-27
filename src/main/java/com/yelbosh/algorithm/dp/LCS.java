package com.yelbosh.algorithm.dp;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.dp.LCS;
import com.yelbosh.algorithm.util.LoggerUtil;

public class LCS {
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(LCS.class);
		char[] arr1 = {'0', 'a', 'b', 'c', 'd', 'e', 'f'};
		char[] arr2 = {'0', 'c', 'd', 'e', 'g'};
		lcs(arr1, arr2);
		logger.info("�������н����");
	}
	
	//��̬�滮������a��s���������ά�����¼������Ϣ
	public static void arrLcs(char[] arr1, char[] arr2, int[][] a, int[][] s){
		for(int i=1;i<arr1.length;i++)
			for(int j=1;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					a[i][j] = a[i-1][j-1] + 1;
					s[i][j] = 1;
				}else if(a[i-1][j] > a[i][j-1]){
					a[i][j] = a[i-1][j];
					s[i][j] = 2;
				}else{
					a[i][j] = a[i][j-1];
					s[i][j] = 3;
				}
			}
	}
	
	public static void lcs(char[] arr1, char[] arr2){
		if(arr1.length == 0 || arr2.length == 0) {
			System.out.println("invalid input");
			return;
		}
		int[][] a = new int[arr1.length][arr2.length];
		int[][] s = new int[arr1.length][arr2.length];
		for(int i=1;i<arr1.length;i++){
			a[i][0] = 0;
		}
		for(int i=1;i<arr2.length;i++){
			a[0][i] = 0;
		}
		arrLcs(arr1, arr2, a, s);
		//��ӡ�ַ���
		CLCS(arr1.length-1, arr2.length-1, arr1, s);
	}
	
	//�ݹ��ӡ��ȡ�Ӵ�
	public static void CLCS(int i, int j, char[] arr1, int[][] s){
		if(i==0||j==0) return;
		if(s[i][j] == 1){
			CLCS(i-1,j-1,arr1,s);
			System.out.print(" "+arr1[i]);
		}else if(s[i][j] == 2)
			CLCS(i-1,j,arr1,s);
		else
			CLCS(i,j-1,arr1,s);
	}
		
}
