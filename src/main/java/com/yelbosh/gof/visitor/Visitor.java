package com.yelbosh.gof.visitor;

public class Visitor implements IVisitor{

	public void visit(ConcreteElementA element) {
		// TODO Auto-generated method stub
		System.out.println("对 A Element 做一些异化操作");
		element.doSomething();
	}

	public void visit(ConcreteElementB element) {
		// TODO Auto-generated method stub
		System.out.println("对 B Element 做一些异化操作");
		element.doSomething();
	}
	
}
