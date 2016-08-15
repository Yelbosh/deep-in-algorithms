package com.yelbosh.algorithm.string;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class KMP {
	public static void main(String[] args) {
		Logger logger = LoggerUtil.getLogger(KMP.class);
		String s = "dfadsbbcabbfasfads";
        String t = "bbcabb"; // 模式串  
        kmp(s, t);
    }  
	
	//获取next数组
	public static int[] getNext(String sub){
		int len = sub.length();
		int j = 0;
		int[] next = new int[len+1];
		next[0] = next[1] = 0;
		for(int i=1;i<len;i++){
			while(j>0 && sub.charAt(i)!=sub.charAt(j))
				j = next[j];
			if(sub.charAt(i)==sub.charAt(j))
				j ++;
			next[i+1] = j;
		}
		return next;
	}
	
	//根据部分匹配值表进行匹配
	public static void kmp(String main, String sub){
		int[] next = getNext(sub);
		int j = 0;
		for(int i=0;i<main.length();i++){
			while(j>0 && main.charAt(i)!=sub.charAt(j))
				j = next[j];
			if(main.charAt(i) == sub.charAt(j))
				j++;
			if(j == sub.length()){
				System.out.println("find at position " + (i - j + 1));  
	            System.out.println(main.subSequence(i - j + 1, i + 1));  
	            j = next[j];  
			}
		}
	}
  
}
