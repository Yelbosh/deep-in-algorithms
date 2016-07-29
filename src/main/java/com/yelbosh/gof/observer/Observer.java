package com.yelbosh.gof.observer;

public interface Observer {
	public void update(Subject subject); //根据subject的状态更新自身的状态
}
