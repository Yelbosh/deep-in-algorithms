package com.yelbosh.gof.iterator;

import java.util.Vector;

/**
 * Iterator��һ������ʵ�֣���β��ͷ��ӡԪ��
 * ���п��Կ�����ÿһ��iterator�ж�������aggregate�����ݼ���һ��������iterator�޷��޸�ԭ�����е�Ԫ��
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
