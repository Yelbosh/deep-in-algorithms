package com.yelbosh.gof.chainofresponsibility;

/**
 * 职责链模式：经典应用，struts中的interceptor中，将请求逐层次处理
 * @author Yabo
 *
 */
public interface Chain {
	public void addChain(Chain chain); //增加下一个链结点
	public Chain getChain(); //获取下一个链结点
	public void sendToChain(String msg); //将消息传递给下一个链结点
}
