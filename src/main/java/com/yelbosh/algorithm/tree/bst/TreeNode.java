package com.yelbosh.algorithm.tree.bst;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	//�������Ϊ���ƹ��캯����java�еı�����Ϊ�������ñ���������ֵ���ñ���������Ƕ������ã�����ʱֻ�Ǵ�����������ָ��ĸ���
	TreeNode(TreeNode node) {this.val = node.val; this.left = node.left; this.right = node.right;}
	TreeNode(int x) { val = x; }
	TreeNode(int x, TreeNode left, TreeNode right) {val=x; this.left = left; this.right = right;}
}
