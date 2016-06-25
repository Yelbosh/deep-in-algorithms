package com.qiuzi.algorithm;

import com.yelbosh.algorithm.util.ArrayUtil;

public class HeapSort {
    
    //小根堆，重复k次，k为元素个数，调整堆，将最小元素置于堆顶并输出，将最后一个元素与堆顶元素兑换，调整堆，迭代寻找下一个堆顶元素
    public static void heapSort(int[] array,int length){
        
        for(int i = length/2-1;i>=0;i--){
            int left = (i+1)*2-1;
            int right = (i+1)*2;
            if(array[i] > array[left]){
                ArrayUtil.swap(array, i, left);
            }
            if(right < length && array[i]>array[right]){
                ArrayUtil.swap(array, i, right);
            }
        }
    }

    public static void main(String[] args){
        int[] array = {3,4,1,4,6,2,1,8,3,9};
        for(int i = 0;i<array.length;i++){
            heapSort(array,array.length-i);
            System.out.print(array[0]+" ");
            ArrayUtil.swap(array, 0, array.length-i-1);
        }
    }
}
