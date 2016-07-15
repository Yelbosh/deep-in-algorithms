package com.yelbosh.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

import com.yelbosh.algorithm.tree.bt.TreeNode;

public class BFS {
	
	//������ȱ���--�ǵݹ�ʵ��--���ö��е���ʽ
	public static void searchNonRec(TreeNode node){
		if(node == null) return;
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.offer(node);
		while(!que.isEmpty()){
			TreeNode front = que.poll();
			front.visited = true;
			if(front.adjacent != null && front.adjacent.size() != 0){
				Vector<TreeNode> adjacents = front.adjacent;
				for(TreeNode adja : adjacents){
					if(adja.visited == false){
						adja.visited = true;
						que.offer(adja);
					}
				}
			}
		}
	}
}
