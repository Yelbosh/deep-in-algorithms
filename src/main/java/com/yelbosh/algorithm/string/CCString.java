package com.yelbosh.algorithm.string;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * cracking the code interview �ַ�����������Ŀ
 * @author Yabo
 *
 */
public class CCString {
	
	public static void test(){
		Logger logger = LoggerUtil.getLogger(StringSub.class);
		String s1 = "hello world my dear ";String s2 = "aabc";
		logger.info("Ҫ������ַ�����"+s1);
		String result = replace20(s1);
		logger.info("���н����"+result);
	}
	
	// 1.1 �ж��ַ������Ƿ�����ظ��ַ�--��ʹ��util�е����ݽṹ--ʹ��4��int��ʾ
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
	
	//1.2 reverseһ���ַ���
	public static String reverseStr(String s){
		return new StringBuffer(s).reverse().toString();
	}
	
	//1.3 �ж�һ���Ƿ�����һ����permutation--�жϸ��ַ�����ͬ����
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
	
	//1.4 ȡ�ÿո�����
	public static int getBlankCount(String s){
		int count = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == ' ')
				count ++;
		}
		return count;
	}
	
	//1.4 ʹ��%20�滻�ո�
	public static String replace20(String s1){
		String s = s1.trim();
		int count = getBlankCount(s);
		if(count == 0) return s;
		int length = s.length();
		int newLength = count * 2 + length;
		char[] newStrArr = new char[newLength];
		for(int i=length-1,j=newLength-1;j>=0;){
			if(s.charAt(i) == ' '){
				newStrArr[j--] = '0';
				newStrArr[j--] = '2';
				newStrArr[j--] = '%';
			}else{
				newStrArr[j--] = s.charAt(i);
			}
			i--;
		}
		return new String(newStrArr);
	}
	
	//1.5 ѹ���ַ���
	public static String compressStr(String s){
		char[] charArray = s.toCharArray();
		int[] letters = new int[256];
		for (char c : charArray) {
            letters[c]++;
        }
		// ����ͳ�����鲢�ҽ��м���
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
	
	//1.7 ����0Ԫ������Ϊ0
	public static void setColRow0(int[][] a){
		
	}
	
	//1.8 ʹ��һ��substring�ж�s1�Ƿ���s2��rotation
	public static boolean rotationWithSubstring(String s1, String s2){
		if((s1+s1).contains(s2))
			return true;
		else
			return false;
	}
	
	//��excel titleת��Ϊ26��������
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
