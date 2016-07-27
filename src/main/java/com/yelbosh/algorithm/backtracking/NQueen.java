package com.yelbosh.algorithm.backtracking;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.bit.CCBitMani;
import com.yelbosh.algorithm.util.LoggerUtil;

public class NQueen {
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(NQueen.class);
		NQueenNonRec(8);
		logger.info("�������н����");
	}
	
	//n�ʺ����ʽԼ�����壬�������i������j��i-j������abs��xi-xj
	//ǰk���ʺ󲻿��Բ�������ʽԼ��,��k���ʺ�����˵�i��
	public static boolean place(int k, int i, int[] x){
		for(int j=0;j<k;j++){
			if(x[j] == i || Math.abs(j-k) == Math.abs(x[j]-i)) return false;
		}
		return true;
	}
	
	//n�ʺ�ĵݹ�д��
	public static void NQueen(int k, int n, int[] x){
		for(int i=0;i<n;i++){ //�������x���ڽ�ռ䣬Ҳ���ǵ�k���ʺ���Է�����������ϣ�����Щ���ܵĽⶼ���п���
			if(place(k, i, x)){ //�ý�������ʽԼ��
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
	
	//n�ʺ����
	public static void NQueen(int n){
		int[] x = new int[n];
		NQueen(0, n, x);
	}
	
	//n�ʺ�ķǵݹ�д��
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
