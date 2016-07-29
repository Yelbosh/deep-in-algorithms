package com.yelbosh.gof.iterator;

import java.util.Vector;

/**
 * 一个集合类
 * @author Yabo
 *
 */
public class DataVector implements Aggregate {
	private Vector data;
	
	public DataVector(){
		this.data = new Vector<String>();
		data.add("I");data.add("Love");data.add("Tian");data.add("Yi");
		data.add("Qiu");data.add("Zi");
	}

	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new DataIterator(data);
	}

}
