package com.qiuzi.algorithm;

import com.yelbosh.algorithm.util.ArrayUtil;

public class BubbleSort {
    public void bubbleSort(int[] array){
        int array_length = array.length;
        for(int i = 0;i < array_length-1;i++){
            for (int j = array_length -1;j>i;j--){
                if(array[j] < array[j-1]){
                    ArrayUtil.swap(array, j, j-1);
                }
            }
        }
    }
}
