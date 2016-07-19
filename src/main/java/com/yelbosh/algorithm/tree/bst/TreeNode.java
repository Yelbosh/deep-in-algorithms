package com.yelbosh.algorithm.tree.bst;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	//可以理解为复制构造函数，java中的变量分为对象引用变量和字面值引用变量，如果是对象引用，传参时只是传了这个对象的指针的副本
	TreeNode(TreeNode node) {this.val = node.val; this.left = node.left; this.right = node.right;}
	TreeNode(int x) { val = x; }
	TreeNode(int x, TreeNode left, TreeNode right) {val=x; this.left = left; this.right = right;}
}
