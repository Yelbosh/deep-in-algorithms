package com.yelbosh.algorithm.tree.bt;

import java.util.Vector;

public class TreeNode {
	public int val;
	public boolean visited;
	public Vector<TreeNode> adjacent;
	
	//�������Ϊ���ƹ��캯����java�еı�����Ϊ�������ñ���������ֵ���ñ���������Ƕ������ã�����ʱֻ�Ǵ�����������ָ��ĸ���
	TreeNode(int x) { val = x; visited=false; this.adjacent = new Vector<TreeNode>(); }
}
