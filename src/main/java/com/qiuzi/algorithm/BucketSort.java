package com.qiuzi.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 桶排序：
 * LSD(Least significant digit first)从个数开始排序，依次向高位，低位放好和合并桶
 * MSD(Most significant digit first)从高位开始，放入桶中后，在桶内向低位分裂直到个位数，按桶的顺序输出
 */
public class BucketSort {
    
    public static void updateSortResult(Map<Integer, List<Integer>> buckets, int[] array){
        int count=0;
        for(int i = 0;i < 10;i++){
            if(buckets.containsKey(i)){
                for(int j = 0;j < buckets.get(i).size();j++){
                    array[count] = buckets.get(i).get(j);
                    count ++;
                }
            }
        }
    }
    
    public static void orderByDigit(int[] array, int digit){
        
        Map<Integer, List<Integer>> buckets = new HashMap<Integer, List<Integer>>();
        for(int i = 0;i < array.length;i++){

            int number = array[i];
            for(int j = digit;j >0;j--){
                number /= 10;
            }
            number %= 10;
            if(!buckets.containsKey(number)){
                List<Integer> list = new ArrayList<Integer>();
                buckets.put(number, list);
            }
            buckets.get(number).add(array[i]);
        }
        updateSortResult(buckets, array);
    }
    
    public static void LSD(int[] array, int digits){
        
        //从低位到高位：按该位存储到桶中后，依次输出到array中
        for(int i = 0;i < digits;i++){
            orderByDigit(array,i);
        }
    }
    
    public static void MSD(int[] array, int digit, int low, int high){

        //buckets中的key对应某位数为key的数字列表
        Map<Integer, List<Integer>> buckets = new HashMap<Integer, List<Integer>>();
        for(int i = low;i < high;i++){
            
            //number表示从低位第digit位的数字
            int number = array[i]%(int)Math.pow(10, digit)/(int)Math.pow(10, digit-1);
            if(!buckets.containsKey(number)){
                List<Integer> list = new ArrayList<Integer>();
                buckets.put(number, list);
            }
            buckets.get(number).add(array[i]);
        }
        
        //将桶排序好的buckets依次放入array，并记录这段数据的low和high，将这段数据按照低一位的数字排序
        int count=low;
        for(int i = 0;i < 10;i++){
            if(buckets.containsKey(i)){
                int start = count, end;
                for(int j = 0;j < buckets.get(i).size();j++){
                    array[count] = buckets.get(i).get(j);
                    count ++;
                }
                end = count;
                if(digit>1)
                    MSD(array, digit-1,start,end);
            }
        }
    }

    public static void bucketSort(int[] array, int digits){
        if(digits < 5){
            System.out.println("LSD");
            LSD(array, digits);
        }
        else{
            System.out.println("MSD");
            MSD(array, digits, 0, array.length);
        }
    }
    
    public static int getDigits(int[] array){
        
        int count = 0;
        for(int i = 0;i < array.length;i++){
            while(array[i]/(int)Math.pow(10, count) > 0){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] array = {10837,294,184,201,485,30,20,280,48,198};
        bucketSort(array,getDigits(array));
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

}
