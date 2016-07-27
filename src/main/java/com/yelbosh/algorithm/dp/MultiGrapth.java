package com.yelbosh.algorithm.dp;

import org.apache.log4j.Logger;

import com.yelbosh.algorithm.util.LoggerUtil;

public class MultiGrapth {
	//测试入口，在main中调用该方法
	public static void test(){
		Logger logger = LoggerUtil.getLogger(MultiGrapth.class);
		multiGraph();
		logger.info("程序运行结果");
	}
	
	//多段图算法
	public static void multiGraph(){
		ENode[] a = init();
		int k = 4, n = 12;
		int[] cost = new int[n];
		int[] d = new int[n];
		cost[n-1] = 0; d[n-1] = -1; //d[j]表示经过j点的最短路经的下一个节点(邻接点)的标号
		int q = -1; //tmp var for path node
		for(int j=n-2;j>=0;j--){
			int MIN = Integer.MAX_VALUE;
			//遍历邻接点
			for(ENode r=a[j];r!=null;r=r.nextArc){
				int v = r.adjVex;
				if(r.w + cost[v] < MIN){
					MIN = r.w + cost[v];
					q = v;
				}
			}
			cost[j] = MIN; d[j] = q;
		}
		//通过cost和d得出最短路径
		int[] p = new int[5];
		p[0] = 0; p[4] = 11;
		for(int j=1;j<=3;j++) p[j] = d[p[j-1]];
		//打印结果
		System.out.print("最短路径为：");
		for(int j=0;j<=4;j++) System.out.print(p[j] + " ");
		System.out.println(" ");
		System.out.print("最短路径长度为：");
		System.out.print(cost[0]);
	}
		
	//init函数，构建邻接图
	public static ENode[] init(){
		//(n-1)ed layer
		ENode node_11 = new ENode(0, 0, null);
		//(n-2)ed layer
		ENode node_edge_8_11 = new ENode(11, 4, null);
		ENode node_8 = node_edge_8_11;
		ENode node_edge_9_11 = new ENode(11, 2, null);
		ENode node_9 = node_edge_9_11;
		ENode node_edge_10_11 = new ENode(11, 5, null);
		ENode node_10 = node_edge_10_11;
		//(n-3)ed layer
		ENode node_edge_5_9 = new ENode(9, 5, null);
		ENode node_edge_5_8 = new ENode(8, 5, node_edge_5_9);
		ENode node_5 = node_edge_5_8;
		ENode node_edge_6_9 = new ENode(9, 3, null);
		ENode node_edge_6_8 = new ENode(8, 4, node_edge_6_9);
		ENode node_6 = node_edge_6_8;
		ENode node_edge_7_10 = new ENode(10, 6, null);
		ENode node_edge_7_9 = new ENode(9, 5, node_edge_7_10);
		ENode node_7 = node_edge_7_9;
		//2nd layer
		ENode node_edge_1_7 = new ENode(7, 1, null);
		ENode node_edge_1_6 = new ENode(6, 2, node_edge_1_7);
		ENode node_edge_1_5 = new ENode(5, 4, node_edge_1_6);
		ENode node_1 = node_edge_1_5;
		ENode node_edge_2_6 = new ENode(6, 7, null);
		ENode node_edge_2_5 = new ENode(5, 2, node_edge_2_6);
		ENode node_2 = node_edge_2_5;
		ENode node_edge_3_7 = new ENode(7, 11, null);
		ENode node_3 = node_edge_3_7;
		ENode node_edge_4_7 = new ENode(7, 8, null);
		ENode node_edge_4_6 = new ENode(6, 11, node_edge_4_7);
		ENode node_4 = node_edge_4_6;
		//1st layer
		ENode node_edge_0_4 = new ENode(4, 2, null);
		ENode node_edge_0_3 = new ENode(3, 3, node_edge_0_4);
		ENode node_edge_0_2 = new ENode(2, 7, node_edge_0_3);
		ENode node_edge_0_1 = new ENode(1, 9, node_edge_0_2);
		ENode node_0 = node_edge_0_1;
		//构造表头指针
		ENode[] a = new ENode[12];
		a[0] = node_0;a[1] = node_1;a[2] = node_2;a[3] = node_3;a[4] = node_4;
		a[5] = node_5;a[6] = node_6;a[7] = node_7;a[8] = node_8;a[9] = node_9;
		a[10] = node_10;a[11] = node_11;
		return a;
	}
	
}
