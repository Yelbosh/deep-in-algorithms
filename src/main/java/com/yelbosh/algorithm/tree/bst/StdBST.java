package com.yelbosh.algorithm.tree.bst;

public interface StdBST {
	//寻找最小值
	public abstract TreeNode findMin();
	//寻找最大值
	public abstract TreeNode findMax();
	//打印树
	public abstract void printTree();
	
	
	//判断树是否包含某元素
	public abstract boolean contains(int x);
	//插入节点
	public abstract void insert(int val);
	//删除节点
	public abstract void remove(int val);
}
