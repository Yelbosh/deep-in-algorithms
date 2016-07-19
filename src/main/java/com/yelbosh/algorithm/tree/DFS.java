package com.yelbosh.algorithm.tree;

import java.util.Stack;
import java.util.Vector;

import com.yelbosh.algorithm.tree.bt.TreeNode;

public class DFS {
	
	//����������ͼ�����������������--�ݹ��㷨
	public static void search(TreeNode node){
		if(node == null) return;
		node.visited = true;
		Vector<TreeNode> adjacents = node.adjacent;
		for(TreeNode adja : adjacents){
			if(adja.visited == false)
				search(adja);
		}
	}
	
	
	//�ǵݹ�ʵ��,���Լ�д�ģ������������ʹ��ջ��FILO�������������ʹ�ö��У�FIFO
	/**
	 *  ��1��ջS��ʼ����visited[n]=0��
		 ��2�����ʶ���v��visited[v]=1������v��ջS
		 ��3��while(ջS�ǿ�)
		
		            x=ջS�Ķ�Ԫ��(����ջ)��
		
		            if(���ڲ��ҵ�δ�����ʵ�x���ڽӵ�w)
		
		                    ����w��visited[w]=1��
		
		                    w��ջ;
		
		            else
		
		                     x��ջ��
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
