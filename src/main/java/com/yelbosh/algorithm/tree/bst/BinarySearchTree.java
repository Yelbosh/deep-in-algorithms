package com.yelbosh.algorithm.tree.bst;

import java.util.Arrays;
import java.util.Stack;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.sort.quicksort.QuickSort;
import com.yelbosh.algorithm.util.LoggerUtil;

public class BinarySearchTree  implements StdBST{
	private TreeNode root; //���ڵ�
	
	public static class Depth{  
        private int depth;  
    }  
	public BinarySearchTree(TreeNode root){
		this.root = root;
	}
	
	public static void test(){
		Logger logger = LoggerUtil.getLogger(BinarySearchTree.class);
		TreeNode root = new TreeNode(8);
		BinarySearchTree bst = new BinarySearchTree(root);
		bst.createBST();
//		TreeNode result = bst.findMax();
//		bst.remove(12);
//		bst.remove(7);
//		int result = bst.maxDepth();
//		boolean result = bst.contains(20);
		bst.printTree();
//		logger.info("�������н����"+result);
	}
	
	public void createBST(){
		this.insert(2);this.insert(10);this.insert(1);this.insert(7);
		this.insert(3);this.insert(9);this.insert(12);this.insert(13);
	}
	
	//��ȡ����������
	public int maxDepth(){
		return maxDepth(root);
	}
	
	//��ȡ���������ȣ������߶�Ϊ1
	public int maxDepth(TreeNode node){
		if(node == null)
			return 0;
		int left = 1; int right = 1;
		left += this.maxDepth(node.left);
		right += this.maxDepth(node.right);
		return left>right?left:right;
	}
	
	//�ж�һ�����Ƿ��Ƕ���������
	public boolean isBST(TreeNode node, int min, int max){
		if(node == null) return true;
		if(node.val < min || node.val > max)
			return false;
		if(!isBST(node.left, min, node.val)) return false;
		if(!isBST(node.right, node.val, max)) return false;
		return true;
	}
	
	//�ж����Ƿ���ƽ�������-����1
	public boolean isBalanced1(TreeNode node){
		if(node == null) return true;
		int left = maxDepth(node.left);
		int right = maxDepth(node.right);
		if(left-right>1 || left-right<-1){
			return false;
		}
		return isBalanced1(node.left) && isBalanced1(node.right);
	}
	
	//�ж϶������Ƿ�ƽ��-����2,��������
	public boolean isBalanced2(TreeNode node, Depth depth){
		if(node == null){
			depth.depth = 0;
			return true;
		}
		Depth leftDepth = new Depth();
		Depth rightDepth = new Depth();
		if(isBalanced2(node.left,leftDepth) && isBalanced2(node.right, rightDepth)){
			int left = leftDepth.depth;
			int right = rightDepth.depth;
			int diff = left - right;
			if(diff == 0 || diff == 1 || diff == -1){
				depth.depth = left>right?left+1:right+1;
				return true;
			}
		}
		return false;
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

	//========================================��׼������ʵ�ֽӿ�========================================
	public TreeNode findMin() {
		// TODO Auto-generated method stub
		return findMin(root);
	}
	
	private TreeNode findMin(TreeNode node){
		if(node == null) return null;
		if(node.left == null) return node;
		return findMin(node.left);
	}

	public TreeNode findMax() {
		// TODO Auto-generated method stub
		return findMax(root);
	}
	
	private TreeNode findMax(TreeNode node){
		if(node == null) return null;
		if(node.right == null) return node;
		return findMax(node.right);
	}

	//��������ʽ��ӡ��
	public void printTree() {
		// TODO Auto-generated method stub
//		preOrderTraverse(root);
		printTree(root, 0);
	}
	
	public void printTree(TreeNode node, int level){
		if(node == null) return;
		for(int i=0;i<level;i++)
			System.out.print("--");
		System.out.print(node.val + "\n");
		printTree(node.left, level+1);
		printTree(node.right, level+1);
	}
	
	//�������
	public void preOrderTraverse(TreeNode node){
		if(node == null) return;
		System.out.print(node.val + " ");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	
	//��������ǵݹ�
	public void preOrderNonRec(TreeNode node){
		if(node == null) return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(node);
		while(!stack.isEmpty()){
			TreeNode tmp = stack.pop();
			System.out.println(tmp.val);
			if(tmp.right != null) stack.push(tmp.right);
			if(tmp.left != null) stack.push(tmp.left);
		}
	}
	
	//��������ǵݹ�
	public void preOrderNonRec2(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(node != null || !stack.isEmpty()){
			if(node != null){
				System.out.println(node.val); //ѹջ֮ǰ�ȷ��ʣ�ѹջ��Ϊ���ڽ������������ҽڵ�
				stack.push(node);
				node = node.left;
			}else{
				node = stack.pop();
				node = node.right;
			}
		}
	}
		
	
	//�������
	public void inOrderTraverse(TreeNode node){
		if(node == null) return;
		inOrderTraverse(node.left);
		System.out.print(node.val + " ");
		inOrderTraverse(node.right);
	}
	
	//��������ǵݹ�
	public void inOrderNonRec(TreeNode node){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(node != null || !stack.isEmpty()){
			if(node != null){
				stack.push(node);
				node = node.left;
			}else{
				node = stack.pop();
				System.out.print(node.val + " ");
				node = node.right;
			}
		}
	}
		
	//�������
	public void postOrderTraverse(TreeNode node){
		if(node == null) return;
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.print(node.val + " ");
	}

	//�ж������Ƿ����ĳ��ֵ
	public boolean contains(int x) {
		// TODO Auto-generated method stub
		return contains(x, root);
	}

	public boolean contains(int x, TreeNode node) {
		if(node == null) return false;
		else if(x < node.val)
			return contains(x, node.left);
		else if(x >  node.val)
			return contains(x, node.right);
		else 
			return true;
	}
	
	public void insert(int val) {
		// TODO Auto-generated method stub
		root = insert(val, root);
	}
	
	//java�����д��ݵĶ������ã�ʵ���Ͽ������ΪC++�ж�ĳ��ָ��Ŀ���������ָ�뱾���ھ��������󲻻ᷢ���ı�
	private TreeNode insert(int val, TreeNode node) {
		// TODO Auto-generated method stub
		if(node == null) return new TreeNode(val, null, null);
		if(val < node.val)
			node.left = insert(val, node.left);
		else if(node.val < val)
			node.right = insert(val, node.right);
		else ;
		return node;
	}

	public void remove(int val) {
		// TODO Auto-generated method stub
		remove(val, root);
	}
	
	public void remove(int val, TreeNode node){
		if(node == null) return;
		else if(val < node.val)
			remove(val, node.left);
		else if(val > node.val)
			remove(val, node.right);
		else if(node.left != null && node.right != null){ //Ҫ�Ƴ��Ľڵ����2������
			//�ҵ���������С�ڵ㣬��Ӻ��Ƴ�
			TreeNode min = findMin(node.right);
			node.val = min.val;
			remove(min.val, min);
		}else{ //Ҫ�Ƴ��Ľڵ����һ������
			TreeNode tmp = node.left == null?node.right:node.left;
			node.val = tmp.val;
			node.left = tmp.left;
			node.right = tmp.right;
		}
	}
	
	
}
