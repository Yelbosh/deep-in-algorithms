package com.yelbosh.algorithm.dp;

/**
 * �ڽ�ͼ�б߽��Ķ��壬��Ȩֵ�Ļ��ǵü�w
 * @author Yabo
 * �ڽ�ͼһ������ڽӱ�ı�ͷ������������ʾ
 *
 */
public class ENode {
	public int adjVex; //�ڽӵ�ID
	public int w; //��Ȩֵ
	public ENode nextArc; //���б���������һ��
	
	//���캯��
	public ENode(int adjVex, int w, ENode nextArc){
		this.adjVex = adjVex;
		this.w = w;
		this.nextArc = nextArc;
	}
}
