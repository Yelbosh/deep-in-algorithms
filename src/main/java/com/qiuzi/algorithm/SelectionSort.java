package com.qiuzi.algorithm;

import com.yelbosh.algorithm.util.ArrayUtil;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            ArrayUtil.swap(array, i, min);
        }
    }

    public static void shell(int[] array, int gap) {

        for(int start = 0;start < gap;start++){
            int min;
            for (int i = start; i < array.length; i+= gap) {
                min = i;
                for (int j = i + gap; j < array.length; j += gap) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }
                ArrayUtil.swap(array, i, min);
            }
        }
    }

    public static void shellSort(int[] array, int gap) {

        shell(array,gap);
        if (gap > 1) {
            gap /= 2;
            shellSort(array, gap);
        }
        
    }

    public static void main(String[] args) {
        
        int gap = 5;
        int[] array = { 3, 4, 1, 4, 6, 2, 1, 8, 3, 9 };
        selectionSort(array);
        shellSort(array, gap);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
