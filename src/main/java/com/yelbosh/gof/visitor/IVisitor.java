package com.yelbosh.gof.visitor;

/**
 * 访问者模式抽象接口
 * @author Yabo
 *
 */
public interface IVisitor {
	public void visit(ConcreteElementA element); //不要使用参数多态，这里符合单一职责原则
	public void visit(ConcreteElementB element);
}
