package com.yelbosh.gof.chainofresponsibility;

/**
 * ְ����ģʽ������Ӧ�ã�struts�е�interceptor�У����������δ���
 * @author Yabo
 *
 */
public interface Chain {
	public void addChain(Chain chain); //������һ�������
	public Chain getChain(); //��ȡ��һ�������
	public void sendToChain(String msg); //����Ϣ���ݸ���һ�������
}
