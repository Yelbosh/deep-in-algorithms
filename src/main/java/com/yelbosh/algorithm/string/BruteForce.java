package com.yelbosh.algorithm.string;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.heapsort.HeapSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class BruteForce {
	
	//暴力匹配算法
	public static int BruteForce(String main, String sub){
		if(main.length() < sub.length()) return -1;
		int index = -1;
		boolean match = true;
		for(int i=0; i<main.length()-sub.length(); i++){
			match = true;
			for(int j=0;j<sub.length();j++)
				if(main.charAt(i+j) != sub.charAt(j))
					match = false;
			if(match){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args)
    {
		Logger logger = LoggerUtil.getLogger(LCS.class);
		int result = BruteForce("fdasfdsaabcdefgddd", "abcdefg");
		logger.info("程序运行结果：" + result);
    }
}
