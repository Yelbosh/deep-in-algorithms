package com.yelbosh.algorithm.tree;

import java.util.Stack;
import java.util.Vector;

import com.yelbosh.algorithm.tree.bt.TreeNode;

public class DFS {
	
	//二叉树或者图的深度优先搜索遍历--递归算法
	public static void search(TreeNode node){
		if(node == null) return;
		node.visited = true;
		Vector<TreeNode> adjacents = node.adjacent;
		for(TreeNode adja : adjacents){
			if(adja.visited == false)
				search(adja);
		}
	}
	
	
	//非递归实现,纯自己写的，深度优先搜索使用栈，FILO，广度优先搜索使用队列，FIFO
	/**
	 *  （1）栈S初始化；visited[n]=0；
		 （2）访问顶点v；visited[v]=1；顶点v入栈S
		 （3）while(栈S非空)
		
		            x=栈S的顶元素(不出栈)；
		
		            if(存在并找到未被访问的x的邻接点w)
		
		                    访问w；visited[w]=1；
		
		                    w进栈;
		
		            else
		
		                     x出栈；
	 */
	public static void searchNonRec(TreeNode node){
		if(node == null) return;
		Stack<TreeNode> st = new Stack<TreeNode>();
		node.visited = true;
		st.push(node);
		while(!st.isEmpty()){
			TreeNode top = st.peek();
			boolean popTag = true;
			if(top.adjacent != null && top.adjacent.size() != 0){
				for(TreeNode adja : top.adjacent){
					if(adja.visited == false){
						popTag = false;
						adja.visited = true;
						st.push(adja);
					}
				}
			}
			if(popTag) st.pop();
		}
	}
}
