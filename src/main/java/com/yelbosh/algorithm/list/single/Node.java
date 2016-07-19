package com.yelbosh.algorithm.list.single;

public class Node {
	public Node next = null;
	public int data;
	
	public Node(int v){
		this.data = v;
		this.next = null;
	}
	
	public void append(int v){
		Node nd = this.next;
		while(nd.next != null)
			nd = nd.next;
		nd.next = new Node(v);
	}
	
}
