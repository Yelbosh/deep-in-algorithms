package com.yelbosh.java.lock.synchronize;

/**
 * synchronized 关键字用来实现对某个对象的多线程同步访问，形式为synchronized(obj){}，在代码块中可以使用wait和notify的对象方法
 * 在java中，Object对象都有对象锁，如果使用wait方法，就会释放对象锁而让其他线程持有，调用notify则会使得wait的线程重新获取对象锁
 * wait会释放对象锁，但是sleep不会，二者都会使线程休眠，并暂时释放cpu
 * 在并发量比较小的情况下，使用synchronized，但是并发量比较大的情况下，使用lock，性能比synchronized好
 * @author Yabo
 *
 */
public class Produce implements Runnable {
	
	public synchronized void run() {
		// TODO Auto-generated method stub
		int count = 2;
		while(count > 0){
			synchronized(SynchronizedTest.obj){
				System.out.println("A");
				count --;
				SynchronizedTest.obj.notify();
				try {
					SynchronizedTest.obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
