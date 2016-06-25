package com.yelbosh.algorithm.tree.bst;

public class BinarySearchTree {
	private TreeNode root; //根节点
	
	public BinarySearchTree(TreeNode root){
		this.root = root;
	}
	
	//打印出树
	public void print(){
		
	}
	
	//获取树的最大深度
	public int maxDepth(TreeNode node){
		if(root == null)
			return 0;
		int left = 1; int right = 1;
		left += this.maxDepth(root.left);
		right += this.maxDepth(root.right);
		return left>right?left:right;
	}
	
	//invert一个树
	public TreeNode invertTree(TreeNode root){
		if(root == null)
			return null;
		TreeNode tmp = this.root.left;
		this.root.left = invertTree(this.root.right);
		this.root.right = invertTree(tmp);
		return root;
	}
	
	
}
