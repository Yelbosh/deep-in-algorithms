package com.yelbosh.gof.visitor;

/**
 * ����Ԫ����ӿ�
 * @author Yabo
 *
 */
public interface Element {
	public void accept(IVisitor visitor);
	public void doSomething(); 
}
