package com.qiuzi.algorithm;

public class QuickSort {
    public void quickSort(int[] array, int low, int high){
        
        int pivot = array[low],i=low,j=high;
        while(i < j){
            while(array[j]>=pivot && i<j){
                j--;
            }
            if(i<j){
                array[i++] = array[j];
            }

            while(array[i]<=pivot && i<j){
                i++;
            }
            if(i<j){
                array[j--] = array[i];
            }
        }

        array[i] = pivot;
        quickSort(array,low,i-1);
        quickSort(array,i+1,high);
        return;
    }
    
    public static void main(String[] args){
        QuickSort sq = new QuickSort();
        int[] array = {3,4,1,4,6,2,1,8,3,9};
        sq.quickSort(array,0,array.length-1);
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}