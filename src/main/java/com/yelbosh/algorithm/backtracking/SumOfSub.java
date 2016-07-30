package com.yelbosh.algorithm.backtracking;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;

/**
 * �Ӽ���������
 * @author Yabo
 *
 */
public class SumOfSub {
	//������ڣ���main�е��ø÷���
	public static void test(){
		Logger logger = LoggerUtil.getLogger(SumOfSub.class);
		int[] x = new int[10];
		int[] w = {4,5,6,8,9,12,14,15,16,20};
		SumOfSubMain(x, 30, w);
		logger.info("�������н����");
	}
	
	/**
	 * �ݹ鷽��
	 * @param s ��ǰ�Ӽ��ĺ�
	 * @param k ��һ��Ҫ�����a[k]
	 * @param r ʣ�¿��ܵ�Ԫ�صĺ�
	 * @param x ���н�����
	 * @param m �Ӽ���M
	 * @param w ԭ��������
	 */
	public static void SumOfSubStub(int s, int k, int r, int[] x, int m, int[] w){
		x[k] = 1;
		//������н�
		if(s+w[k] == m){
			System.out.print("Ѱ�ҵ�һ�����н�: ");
			for(int i=0;i<=k;i++){
				if(x[i] == 1) System.out.print(w[i] + " ");
			}
			System.out.println(" ");
		}
		//��x[k]�����Ӽ����൱���������������
		else if(s + w[k] + w[k+1] <= m){
			SumOfSubStub(s+w[k], k+1, r-w[k], x, m, w);
		}
		//����x[k]�����Ӽ����൱������������
		if((s+r-w[k]>=m) && (s+w[k+1]<=m)){ //��ȥw[k]֮��Ԫ�غʹ���m���ǻ�������
			x[k] = 0;
			SumOfSubStub(s, k+1, r-w[k], x, m, w);
		}
	}
	
	//�ݹ鷽�����
	public static void SumOfSubMain(int[] x, int m, int[] w){
		int r = 0;
		for(int i=0;i<w.length;i++)
			r += w[i];
		if((r>=m) && (w[0]<m)) SumOfSubStub(0, 0, r, x, m, w);
	}

}
