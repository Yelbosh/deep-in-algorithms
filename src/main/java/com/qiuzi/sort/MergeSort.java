package com.qiuzi.sort;

public class MergeSort {

    public static void merge(int[] array1, int[] array2, int[] array){
        
        int flag1 = 0,flag2 = 0;
        int length1 = array1.length, length2 = array2.length;
        while(flag1 < length1 && flag2 < length2){
            array[flag1+flag2] = array1[flag1]<array2[flag2]?array1[flag1++]:array2[flag2++];
        }
        while(flag1 < length1){
            array[flag1+flag2] = array1[flag1++];
        }
        while(flag2 < length2){
            array[flag1+flag2] = array2[flag2++];
        }
    }
    
    public static void mergeSort(int low, int high, int[] array, int[] sortedArray){

        int middle = (int) (high + low)/2;
        int size1 = middle-low+1, size2 = high-middle;
        int[] sortedArray1 = new int[size1];
        int[] sortedArray2 = new int[size2];
        if(size1 > 1){
            mergeSort(low,middle,array,sortedArray1);
        }
        else{
            sortedArray1[0] = array[low];
        }
        if(size2 > 1){
            mergeSort(middle+1,high,array,sortedArray2);
        }
        else{
            sortedArray2[0] = array[high];
        }
        merge(sortedArray1,sortedArray2,sortedArray);
    }
    
    public static void main(String[] args){
        
        int[] array = {3,4,1,4,6,2,1,8,3,9};
        int[] sortedArray = new int[array.length];
        mergeSort(0, array.length-1, array, sortedArray);
        for(int i = 0;i<array.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
    }
}