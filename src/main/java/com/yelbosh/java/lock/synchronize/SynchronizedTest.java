package com.yelbosh.java.lock.synchronize;

/**
 * synchronized 线程交替获得打印对象的例子
 * @author Yabo
 *
 */
public class SynchronizedTest {
	public static SynchronizedTest obj;
	
	public static void main(String[] args){
		SynchronizedTest.obj = new SynchronizedTest();
		(new Thread(new Produce())).start();
		(new Thread(new Consume())).start();
//		(new Thread(new Consume2())).start();
	}
}
