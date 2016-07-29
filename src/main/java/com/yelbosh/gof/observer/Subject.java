package com.yelbosh.gof.observer;

import java.util.Vector;

/*
 * 抽象主题
 */
public abstract class Subject {
	public abstract void attach(Observer observer); //增加观察者列表
	public abstract void detach(Observer observer); //删除观察者列表
	public abstract void sendNotify(); //发送通知
	
	public abstract Vector getState(); //获取状态，观察者和主题维护一致的状态
	public abstract void setState(String act, String str); //设置状态
	
}
