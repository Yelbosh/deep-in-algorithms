package com.yelbosh.algorithm.tree.bst;

public class BinarySearchTree {
	private TreeNode root; //���ڵ�
	
	public BinarySearchTree(TreeNode root){
		this.root = root;
	}
	
	//��ӡ����
	public void print(){
		
	}
	
	//��ȡ����������
	public int maxDepth(TreeNode node){
		if(root == null)
			return 0;
		int left = 1; int right = 1;
		left += this.maxDepth(root.left);
		right += this.maxDepth(root.right);
		return left>right?left:right;
	}
	
	//invertһ����
	public TreeNode invertTree(TreeNode root){
		if(root == null)
			return null;
		TreeNode tmp = this.root.left;
		this.root.left = invertTree(this.root.right);
		this.root.right = invertTree(tmp);
		return root;
	}
	
	
}
