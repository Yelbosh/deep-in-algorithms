package com.yelbosh.gof.visitor;

/**
 * 访问者模式
 * 封装某些作用于某种数据结构中各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作
 * 凡是适用访问者模式的场景中，元素类中需要封装在访问者中的操作必定是与元素类本身关系不大且是易变的操作
 * @author Yabo
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteElementA a = new ConcreteElementA();
		ConcreteElementB b = new ConcreteElementB();
		a.accept(new Visitor());
		b.accept(new Visitor());
	}

}
