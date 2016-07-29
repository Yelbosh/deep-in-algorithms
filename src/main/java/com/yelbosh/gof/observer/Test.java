package com.yelbosh.gof.observer;

/**
 * Observer模式的应用：order的多模块应用，order下单主逻辑是subject
 * 模板的数据和element的绑定
 * @author Yabo
 *
 */
public class Test {
	public static void main(String[] args){
		Subject subject = new ConcreteSubject();
		Observer observer1 = new ObserverA(subject);
		Observer observer2 = new ObserverB();
		subject.attach(observer1);
		subject.attach(observer2);
		
		subject.setState("ADD", "One --- 1");
		subject.setState("ADD", "Tow --- 2");
		subject.sendNotify();
		
		((ObserverA)observer1).changeState("ADD", "Three --- 3");
		((ObserverA)observer1).notifySub(); //只有在一方notify之后，整个系统的状态才会一致
	}
}
