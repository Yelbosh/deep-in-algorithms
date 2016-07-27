package com.yelbosh.algorithm.backtracking;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.bit.CCBitMani;
import com.yelbosh.algorithm.util.LoggerUtil;

public class NQueen {
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(NQueen.class);
		NQueenNonRec(8);
		logger.info("程序运行结果：");
	}
	
	//n皇后的隐式约束定义，对任意的i不等于j，i-j不等于abs的xi-xj
	//前k个皇后不可以不满足隐式约束,第k个皇后放在了第i列
	public static boolean place(int k, int i, int[] x){
		for(int j=0;j<k;j++){
			if(x[j] == i || Math.abs(j-k) == Math.abs(x[j]-i)) return false;
		}
		return true;
	}
	
	//n皇后的递归写法
	public static void NQueen(int k, int n, int[] x){
		for(int i=0;i<n;i++){ //对任意的x属于解空间，也就是第k个皇后可以放在任意的列上，对这些可能的解都进行考查
			if(place(k, i, x)){ //该解满足隐式约束
				x[k] = i;
				if(k == n-1){
					for(int j=0;j<n;j++)
						System.out.print(x[j]+" ");
					System.out.println(" ");
				}else
					NQueen(k+1, n, x);
			}
		}
	}
	
	//n皇后入口
	public static void NQueen(int n){
		int[] x = new int[n];
		NQueen(0, n, x);
	}
	
	//n皇后的非递归写法
	public static void NQueenNonRec(int n){
		int[] x = new int[n];
		int k = 0;
		int i = 0;
		while(k >= 0){
			boolean flag = false;
			for(;i<n;i++){
				if(place(k, i, x)){
					x[k] = i;
					flag = true;
					if(k == n-1){
						for(int j=0;j<n;j++)
							System.out.print(x[j]+" ");
						System.out.println(" ");
					}else{
						k++;
						i = 0;
					}
				}
			}
			if(!flag){
				if(k != 0)
					i = x[k-1] + 1;
				k--;
			}
			
		}
	}
		
		
}
