package com.yelbosh.algorithm.recursive;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.tree.bst.BinarySearchTree;
import com.yelbosh.algorithm.tree.bst.TreeNode;
import com.yelbosh.algorithm.util.LoggerUtil;

public class CCRecursive {
	public static void test(){
		Logger logger = LoggerUtil.getLogger(BinarySearchTree.class);
		printTopDownRobotPath(3,3);
//		logger.info("�������н����"+result);
	}
	
	//9.1 ��������ΪN��¥�ݵķ�������,�ҳ���������n=1��ʼbottom up����
	public static int countStairWays(int n){
		if(n < 0) return 0;
		if(n == 0) return 1;
		return countStairWays(n-1) + countStairWays(n-2) + countStairWays(n-3);
	}
	
	//9.2 �����������̵����⣬��άƽ��������ĵݹ�����
	public static int topDownRobotPath(int x, int y){
		if(x == 1 || y == 1) return 1;
		return topDownRobotPath(x-1, y) + topDownRobotPath(x, y-1);
	}
	
	private class Point {
		public int x;
		public int y;
	}
	
	//9.2 ��ӡ·��, �ȴ洢�� ����ٴ�ӡ
	public static void printTopDownRobotPath(int m, int n){
		
	}

}
