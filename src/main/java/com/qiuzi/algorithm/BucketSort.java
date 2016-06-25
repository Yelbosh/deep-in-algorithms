package com.qiuzi.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Ͱ����
 * LSD(Least significant digit first)�Ӹ�����ʼ�����������λ����λ�źúͺϲ�Ͱ
 * MSD(Most significant digit first)�Ӹ�λ��ʼ������Ͱ�к���Ͱ�����λ����ֱ����λ������Ͱ��˳�����
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
        
        //�ӵ�λ����λ������λ�洢��Ͱ�к����������array��
        for(int i = 0;i < digits;i++){
            orderByDigit(array,i);
        }
    }
    
    public static void MSD(int[] array, int digit, int low, int high){

        //buckets�е�key��Ӧĳλ��Ϊkey�������б�
        Map<Integer, List<Integer>> buckets = new HashMap<Integer, List<Integer>>();
        for(int i = low;i < high;i++){
            
            //number��ʾ�ӵ�λ��digitλ������
            int number = array[i]%(int)Math.pow(10, digit)/(int)Math.pow(10, digit-1);
            if(!buckets.containsKey(number)){
                List<Integer> list = new ArrayList<Integer>();
                buckets.put(number, list);
            }
            buckets.get(number).add(array[i]);
        }
        
        //��Ͱ����õ�buckets���η���array������¼������ݵ�low��high����������ݰ��յ�һλ����������
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
