package com.yelbosh.algorithm.string;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.bit.CCBitMani;
import com.yelbosh.algorithm.util.LoggerUtil;

/*
 * 两个字符串的最长公共子串，和最长公共子序列的区别是，它要求序列是连续的
 * */
public class LCS {
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(LCS.class);
		lcs("abcdefg", "ghiscdeabcaaa");
		logger.info("程序运行结果：");
	}
	
	//动态规划法求解，如果对应位置的字符相同，则将该位置置为左上角加1
	public static void strLcs(String s1, String s2, int[][] a){
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		for(int i=1;i<charArr1.length;i++)
			for(int j=1;j<charArr2.length;j++){
				if(charArr1[i] == charArr2[j])
					a[i][j] = a[i-1][j-1] + 1;
			}
	}
	
	//入口函数
	public static void lcs(String s1, String s2){
		if(s1 == null || s2 == null || "".equals(s1) || "".equals(s2)) {
			System.out.println("invalid input");
			return;
		}
		if(s1.contains(s2)){
			System.out.println(s2);
			return;
		}
		if(s2.contains(s1)){
			System.out.println(s1);
			return;
		}
		int[][] a = new int[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) == s2.charAt(0)) a[i][0] = 1;
			else a[i][0] = 0;
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i) == s1.charAt(0)) a[0][i] = 1;
			else a[0][i] = 0;
		}
		strLcs(s1, s2, a);
		//寻找并打印路径
		int maxLen = s1.length()>s2.length()?s1.length():s2.length();
		int max = 0;
		for(int i=0;i<s1.length();i++)
			for(int j=1;j<s2.length();j++){
				if(a[i][j] > max)
					max = a[i][j];
			}
		if(max == 0) {
			System.out.println("none lcs");
			return;
		}
		//print the lcs
		for(int i=0;i<s1.length();i++)
			for(int j=1;j<s2.length();j++){
				if(a[i][j] == max)
					printLcs(s1, a, i, j);
			}
	}
	
	//打印lcs
	public static void printLcs(String s1, int[][] a, int i, int j){
		StringBuilder result = new StringBuilder();
		while(i>=0 && j>=0 && a[i][j]>0){
			result.append(s1.charAt(i));
			i--;
			j--;
		}
		System.out.println(result.reverse().toString());
	}
}
