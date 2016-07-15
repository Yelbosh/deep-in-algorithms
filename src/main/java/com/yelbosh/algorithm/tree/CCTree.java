package com.yelbosh.algorithm.tree;

import java.util.LinkedList;
import java.util.Vector;

public class CCTree {
	
	//内部类，4.4使用
	private class BTNode {
		int val;
		BTNode left, right;
	}
	
	//给定一个有序数组(递增)，写程序构建一棵具有最小高度的二叉树
	public static void constructSortedTree(){
		
	}
	
	//4.4 将层数为d的二叉树上的每一层的节点构造成链表输出
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
