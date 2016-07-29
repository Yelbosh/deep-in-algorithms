package com.yelbosh.gof.iterator;

import java.util.Vector;

/**
 * Iterator的一个具体实现，从尾到头打印元素
 * 从中可以看出，每一个iterator中都保存了aggregate的数据集合一个副本，iterator无法修改原集合中的元素
 * @author Yabo
 *
 */
public class DataIterator implements Iterator {
	private Vector data;
	private int cursor;
	
	public DataIterator(Vector data){
		this.data = data;
		First();
	}
	

	public void First() {
		// TODO Auto-generated method stub
		this.cursor = (data.size()-1);
	}

	public void Next() {
		// TODO Auto-generated method stub
		this.cursor --;
	}
	
	public boolean IsDone() {
		// TODO Auto-generated method stub
		return (cursor<0);
	}

	public void CurrentItem() {
		// TODO Auto-generated method stub
		if(IsDone()){
			System.out.println("no more element");
		}else{
			System.out.println("current item is: " + data.get(cursor));
		}
		
	}



	
}
