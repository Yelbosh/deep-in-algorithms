package com.yelbosh.algorithm.queue;

import com.yelbosh.algorithm.list.single.Node;

public class Queue {
	Node first, last;
	
	public void enqueue(int val){
		if(first == null){
			first = new Node(val);
			last = first;
		}else{
			last.next = new Node(val);
			last = last.next;
		}
	}
	
	public int dequeue(){
		if(first != null){
			int data = first.data;
			first = first.next;
			return data;
		}else
			return -1;
	}
}
