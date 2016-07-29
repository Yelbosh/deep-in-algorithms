package com.yelbosh.java.lock.synchronize;

public class Consume implements Runnable {
	
	public synchronized void run() {
		// TODO Auto-generated method stub
		int count = 2;
		while(count > 0){
			synchronized(SynchronizedTest.obj){
				System.out.println("B");
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
