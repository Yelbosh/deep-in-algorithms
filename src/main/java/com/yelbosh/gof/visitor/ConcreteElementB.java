package com.yelbosh.gof.visitor;

public class ConcreteElementB implements Element {

	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("����element A�Ĵ�ӡ");
	}

}
