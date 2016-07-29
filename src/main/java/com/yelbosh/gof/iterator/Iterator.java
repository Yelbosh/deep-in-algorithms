package com.yelbosh.gof.iterator;

/**
 * 迭代器抽象接口
 * @author Yabo
 *
 */
public interface Iterator {
	public void First(); //游标回到基点
	public void Next(); //游标往下走
	public boolean IsDone(); //是否遍历结束
	public void CurrentItem(); //输出当前的字符串
}
