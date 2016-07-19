package com.yelbosh.algorithm.stack;

import com.yelbosh.algorithm.list.single.Node;

public class Stack {
	Node top;
	
	public int pop(){
		if(top != null){
			int data = top.data;
			top = top.next;
			return data;
		}
		return -1;
	}
	
	public void push(int val){
		Node node = new Node(val);
		node.next = top;
		this.top = node;
	}
	
	public int peek(){
		if(top != null) return top.data;
		else
			return -1;
	}
}
