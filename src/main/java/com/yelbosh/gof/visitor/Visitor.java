package com.yelbosh.gof.visitor;

public class Visitor implements IVisitor{

	public void visit(ConcreteElementA element) {
		// TODO Auto-generated method stub
		System.out.println("�� A Element ��һЩ�컯����");
		element.doSomething();
	}

	public void visit(ConcreteElementB element) {
		// TODO Auto-generated method stub
		System.out.println("�� B Element ��һЩ�컯����");
		element.doSomething();
	}
	
}
