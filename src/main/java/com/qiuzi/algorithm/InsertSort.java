package com.qiuzi.algorithm;

import com.yelbosh.algorithm.util.ArrayUtil;

public class InsertSort {

    public static void insertSort(int[] array){
        
        for(int i = 1;i < array.length;i++){
            int j = i;
            while(j>0 && array[j]<array[j-1]){
                ArrayUtil.swap(array, j-1, j);
                j --;
            }
        }
    }
    

    public static void main(String[] args){
        
        int[] array = {3,4,1,4,6,2,1,8,3,9};
        insertSort(array);
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
