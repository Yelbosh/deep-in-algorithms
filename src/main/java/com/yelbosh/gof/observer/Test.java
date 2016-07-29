package com.yelbosh.gof.observer;

/**
 * Observerģʽ��Ӧ�ã�order�Ķ�ģ��Ӧ�ã�order�µ����߼���subject
 * ģ������ݺ�element�İ�
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
		((ObserverA)observer1).notifySub(); //ֻ����һ��notify֮������ϵͳ��״̬�Ż�һ��
	}
}
