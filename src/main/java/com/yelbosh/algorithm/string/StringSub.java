package com.yelbosh.algorithm.string;

import java.util.Arrays;
import java.util.Stack;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.ext.SortExt;
import com.yelbosh.algorithm.util.LoggerUtil;

public class StringSub {
	
	public static void test(){
		Logger logger = LoggerUtil.getLogger(StringSub.class);
		String s = "abcdef";
		logger.info("要输入的字符串："+s);
		int result = largestSubString(s);
		logger.info("运行结果："+result);
	}
	
	//获取无重复字符的最大子串的长度
	public static int largestSubString(String s){
		int answer = 0;
		boolean[] have = new boolean[65535];
		for(int i=0;i<65535;i++) have[i] = false;
		for(int i=0,j=0;;i++){
			while((j<s.length()) && (!have[s.charAt(j)])){
				have[s.charAt(j++)] = true;
			}
			answer = Math.max(answer, j-i);
			if(j >= s.length()) break;
			while(s.charAt(i) != s.charAt(j)) 
				have[s.charAt(i++)] = false;
			have[s.charAt(i)] = false;
		}
		return answer;
	}
	
	//移除重复字符并保证字典序最小--堆栈法
	public static String removeDuplicateLetters(String s){
		boolean[] in = new boolean[26];
		int[] nums = new int[26];
		Stack<Character> stack = new Stack<Character>(); 
		for(int i=0;i<26;i++) in[i] = false;
		for(int i=0;i<s.length();i++){
			++nums[s.charAt(i) - 'a'];
		}
		for(int i=0;i<s.length();i++){
			int c = s.charAt(i) - 'a';
			--nums[c];
			//如果重复且有比其更小的
			if(!in[c]){
				while((!stack.isEmpty()) && (nums[stack.peek().charValue() - 'a'] != 0) && (s.charAt(i)<stack.peek().charValue())){
					int c2 = stack.peek().charValue() - 'a';
					in[c2] = false;
					stack.pop();
				}
				in[c] = true;
				stack.push(s.charAt(i));
			}
		}
		String answer = "";
		for(;!stack.isEmpty();){
			answer = stack.pop().charValue() + answer;
		}
		return answer;
	}
	
	
}
