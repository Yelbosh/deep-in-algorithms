package com.yelbosh.algorithm.dp;

/**
 * 邻接图中边结点的定义，带权值的话记得加w
 * @author Yabo
 * 邻接图一般采用邻接表的表头结点的数组来表示
 *
 */
public class ENode {
	public int adjVex; //邻接点ID
	public int w; //边权值
	public ENode nextArc; //所有表结点连接在一起
	
	//构造函数
	public ENode(int adjVex, int w, ENode nextArc){
		this.adjVex = adjVex;
		this.w = w;
		this.nextArc = nextArc;
	}
}
