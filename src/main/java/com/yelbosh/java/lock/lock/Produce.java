package com.yelbosh.java.lock.lock;

import java.util.concurrent.locks.Lock;

public class Produce implements Runnable{
	
	int count = 2;
	Lock lock;
	
	public Produce(Lock lock){
		this.lock = lock;
	}

	public void run() {
		// TODO Auto-generated method stub
		while(count > 0){
			try{
				System.out.println("A");
				lock.lock();
				count--;
			}finally{
				lock.unlock();
				try {
                    Thread.sleep(90L);
				} catch (InterruptedException e) {
                     // TODO Auto-generated catch block
                    e.printStackTrace();
				}
			}
		}
	}
	
}
