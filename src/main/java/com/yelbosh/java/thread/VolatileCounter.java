package com.yelbosh.java.thread;

public class VolatileCounter {
	public static volatile int result = 0;
	
	public static void inc(){
		try{
			Thread.sleep(100);
		}catch (InterruptedException e) {
			
        }
		result++;
	}
	
	public static void main(String[] args){
		for(int i=0;i<1000;i++){
			new Thread(new Runnable(){
				public void run(){
					VolatileCounter.inc();
                }
			}).start();
		}
		
		System.out.println("运行结果:VolatileCounter.result=" + VolatileCounter.result);
	}
}
