package com.yelbosh.algorithm;

import java.util.Vector;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.yelbosh.algorithm.backtracking.NQueen;
import com.yelbosh.algorithm.backtracking.SumOfSub;
import com.yelbosh.algorithm.bit.CCBitMani;
import com.yelbosh.algorithm.recursive.CCRecursive;
import com.yelbosh.algorithm.sort.bubblesort.BubbleSort;
import com.yelbosh.algorithm.sort.bucketsort.BucketSort;
import com.yelbosh.algorithm.sort.ext.SortExt;
import com.yelbosh.algorithm.sort.insertsort.InsertSort;
import com.yelbosh.algorithm.sort.mergesort.MergeSort;
import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.stack.CCStack;
import com.yelbosh.algorithm.string.CCString;
import com.yelbosh.algorithm.dp.LCS;
import com.yelbosh.algorithm.dp.MultiGrapth;
import com.yelbosh.algorithm.string.StringSub;
import com.yelbosh.algorithm.string.Trie;
import com.yelbosh.algorithm.tree.bst.BinarySearchTree;
import com.yelbosh.algorithm.util.ArrayUtil;
import com.yelbosh.algorithm.util.LoggerUtil;

public class App 
{
	public static void main(String[] args)
    {
    	long starTime = System.currentTimeMillis();
    	SumOfSub.test();
    	long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
    	System.out.println(time);
    }
}
