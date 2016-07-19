package com.yelbosh.algorithm.string;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * cracking the code interview 字符串操作类题目
 * @author Yabo
 *
 */
public class CCString {
	
	public static void test(){
		Logger logger = LoggerUtil.getLogger(StringSub.class);
		String s1 = "aabccc";String s2 = "aabc";
		logger.info("要输入的字符串："+s1);
		int result = titleToNumber("A");
		logger.info("运行结果："+result);
	}
	
	// 1.1 判断字符串中是否包含重复字符--不使用util中的数据结构--使用4个int表示
	public static boolean containsDuplicateChar(String s){
		int[] flags = new int[8];
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			int flag = c / 32;
			int shift = c % 32;
			if((flags[flag] & (1<<shift)) != 0){
				return true;
			}
			(flags[flag]) |= (1<<shift);
		}
		return false;
	}
	
	//1.2 reverse一个字符串
	public static String reverseStr(String s){
		return new StringBuffer(s).reverse().toString();
	}
	
	//1.3 判断一个是否是另一个的permutation--判断各字符数相同即可
	public static boolean isPermutation(String s1, String s2) {  
        if(s1.length()!=s2.length())  
            return false;  
        int[] letters = new int[256];  
        char[] charArray = s1.toCharArray();  
        for (char c : charArray) {
            letters[c]++;    
        }  
            
        for (int i = 0; i < s2.length(); i++) {  
            int c = (int) s2.charAt(i);  
            if (--letters[c] < 0) {  
                return false;  
            }  
        }  
            
        return true;  
    }  
	
	//1.4 使用%20替换空格
	public static String replace20(String s){
		return s;
	}
	
	//1.5 压缩字符串
	public static String compressStr(String s){
		char[] charArray = s.toCharArray();
		int[] letters = new int[256];
		for (char c : charArray) {
            letters[c]++;
        }
		// 遍历统计数组并且进行计算
		StringBuffer sb = new StringBuffer();
		int sum = 0;
		for (int i = 0; i < letters.length; i++) {  
			char letter = (char)i;
			int count = letters[i];
			if(count != 0){
				int weight = count - (1 + (count+"").length());
				sb.append(letter);sb.append(count+"");
				sum += weight;
			}
			
		}
		if(sum == 0) return s;
		else
			return sb.toString();
	}
	
	//1.6 rotate the image matrix
	public static void rotateImage(){
		
	}
	
	//1.7 设置0元素行列为0
	public static void setColRow0(int[][] a){
		
	}
	
	//1.8 使用一次substring判断s1是否是s2的rotation
	public static boolean rotationWithSubstring(String s1, String s2){
		if((s1+s1).contains(s2))
			return true;
		else
			return false;
	}
	
	//将excel title转换为26进制数字
	public static int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int[] nums = new int[charArray.length];
        int result = 0;
        for(int i=0;i<charArray.length;i++){
            nums[i] = (int)(charArray[i] - 'A' + 1);
//            System.out.println(nums[i]);
        }
        for(int i=0;i<charArray.length;i++){
//        	System.out.println(26^(charArray.length-1-i));
            result += (nums[i] * Math.pow(26, charArray.length-1-i));
        }
        return result;
    }
}
