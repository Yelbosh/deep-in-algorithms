package com.yelbosh.algorithm.tree.bst;

public interface StdBST {
	//Ѱ����Сֵ
	public abstract TreeNode findMin();
	//Ѱ�����ֵ
	public abstract TreeNode findMax();
	//��ӡ��
	public abstract void printTree();
	
	
	//�ж����Ƿ����ĳԪ��
	public abstract boolean contains(int x);
	//����ڵ�
	public abstract void insert(int val);
	//ɾ���ڵ�
	public abstract void remove(int val);
}
