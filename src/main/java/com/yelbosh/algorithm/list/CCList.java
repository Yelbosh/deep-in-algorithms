package com.yelbosh.algorithm.list;

import com.yelbosh.algorithm.list.single.Node;

public class CCList {
	
	/*2.7 判断链表是否有环，并判断环的入口
	 * 方法：两个指针，一个每次一步，一个每次两步
	 * 则：2s-s = n*r = a+t
	 * n*r-t = a
	 * 故从相遇点和表头放两个一样步速的指针，则第一次相遇一定是在入口点
	 * 
	 * */
	public static boolean existCircle(Node head){
		return true;
	}
	
	public static Node getCircleMouth(Node head){
		return head;
	}
	
	
}
