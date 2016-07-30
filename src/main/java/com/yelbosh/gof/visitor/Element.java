package com.yelbosh.gof.visitor;

/**
 * 抽象元素类接口
 * @author Yabo
 *
 */
public interface Element {
	public void accept(IVisitor visitor);
	public void doSomething(); 
}
