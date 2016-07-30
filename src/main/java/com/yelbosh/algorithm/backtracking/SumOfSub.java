package com.yelbosh.algorithm.backtracking;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * 子集和数问题
 * @author Yabo
 *
 */
public class SumOfSub {
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(SumOfSub.class);
		int[] x = new int[10];
		int[] w = {4,5,6,8,9,12,14,15,16,20};
		SumOfSubMain(x, 30, w);
		logger.info("程序运行结果：");
	}
	
	/**
	 * 递归方法
	 * @param s 当前子集的和
	 * @param k 下一个要考察的a[k]
	 * @param r 剩下可能的元素的和
	 * @param x 可行解数据
	 * @param m 子集和M
	 * @param w 原来的数组
	 */
	public static void SumOfSubStub(int s, int k, int r, int[] x, int m, int[] w){
		x[k] = 1;
		//满足可行解
		if(s+w[k] == m){
			System.out.print("寻找到一个可行解: ");
			for(int i=0;i<=k;i++){
				if(x[i] == 1) System.out.print(w[i] + " ");
			}
			System.out.println(" ");
		}
		//将x[k]加入子集，相当于深度搜索左子树
		else if(s + w[k] + w[k+1] <= m){
			SumOfSubStub(s+w[k], k+1, r-w[k], x, m, w);
		}
		//不把x[k]加入子集，相当于搜索右子树
		if((s+r-w[k]>=m) && (s+w[k+1]<=m)){ //除去w[k]之后，元素和大于m才是基本条件
			x[k] = 0;
			SumOfSubStub(s, k+1, r-w[k], x, m, w);
		}
	}
	
	//递归方法入口
	public static void SumOfSubMain(int[] x, int m, int[] w){
		int r = 0;
		for(int i=0;i<w.length;i++)
			r += w[i];
		if((r>=m) && (w[0]<m)) SumOfSubStub(0, 0, r, x, m, w);
	}

}
