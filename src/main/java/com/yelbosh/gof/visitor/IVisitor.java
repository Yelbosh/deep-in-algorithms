package com.yelbosh.gof.visitor;

/**
 * ������ģʽ����ӿ�
 * @author Yabo
 *
 */
public interface IVisitor {
	public void visit(ConcreteElementA element); //��Ҫʹ�ò�����̬��������ϵ�һְ��ԭ��
	public void visit(ConcreteElementB element);
}
