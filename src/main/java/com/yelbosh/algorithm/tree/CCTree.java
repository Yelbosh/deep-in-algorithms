package com.yelbosh.algorithm.tree;

import java.util.LinkedList;
import java.util.Vector;

public class CCTree {
	
	//�ڲ��࣬4.4ʹ��
	private class BTNode {
		int val;
		BTNode left, right;
	}
	
	//����һ����������(����)��д���򹹽�һ�þ�����С�߶ȵĶ�����
	public static void constructSortedTree(){
		
	}
	
	//4.4 ������Ϊd�Ķ������ϵ�ÿһ��Ľڵ㹹����������
	public static void returnLevelLinkList(BTNode root){
		Vector<LinkedList> res = new Vector<LinkedList>();
		LinkedList<BTNode> list = new LinkedList<BTNode>();
		list.add(root);
		res.add(list);
		int level = 0;
		while(!res.get(level).isEmpty()){
			LinkedList<BTNode> levelList = res.get(level);
			LinkedList<BTNode> newlist = new LinkedList<BTNode>();
			for(BTNode node : levelList){
				if(node.left != null) newlist.add(node.left);
				if(node.right != null) newlist.add(node.right);
			}
			res.add(newlist);
			level++;
		}
	}
	
	
}
