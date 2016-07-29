package com.yelbosh.gof.iterator;

/**
 * 集合类的接口，用于创建并返回Iterator
 * @author Yabo
 *
 */
public interface Aggregate {
	public Iterator CreateIterator(); //返回迭代器
}
