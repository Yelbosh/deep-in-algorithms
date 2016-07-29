package com.yelbosh.gof.factory.abs;

/**
 * 抽象工厂类的工厂抽象类，里面有创建多个具体产品类的接口
 * @author Yabo
 *
 */
public abstract class Room {
	public abstract Window makeWindow();
	public abstract Door makeDoor();
}
