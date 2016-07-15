package com.yelbosh.algorithm.tree.bt;

import java.util.Vector;

public class TreeNode {
	public int val;
	public boolean visited;
	public Vector<TreeNode> adjacent;
	
	//可以理解为复制构造函数，java中的变量分为对象引用变量和字面值引用变量，如果是对象引用，传参时只是传了这个对象的指针的副本
	TreeNode(int x) { val = x; visited=false; this.adjacent = new Vector<TreeNode>(); }
}
