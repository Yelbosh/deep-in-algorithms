package com.yelbosh.gof.visitor;

/**
 * ������ģʽ
 * ��װĳЩ������ĳ�����ݽṹ�и�Ԫ�صĲ������������ڲ��ı����ݽṹ��ǰ���¶�����������ЩԪ�ص��µĲ���
 * �������÷�����ģʽ�ĳ����У�Ԫ��������Ҫ��װ�ڷ������еĲ����ض�����Ԫ���౾���ϵ���������ױ�Ĳ���
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
