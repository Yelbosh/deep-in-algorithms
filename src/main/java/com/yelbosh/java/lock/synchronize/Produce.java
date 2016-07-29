package com.yelbosh.java.lock.synchronize;

/**
 * synchronized �ؼ�������ʵ�ֶ�ĳ������Ķ��߳�ͬ�����ʣ���ʽΪsynchronized(obj){}���ڴ�����п���ʹ��wait��notify�Ķ��󷽷�
 * ��java�У�Object�����ж����������ʹ��wait�������ͻ��ͷŶ��������������̳߳��У�����notify���ʹ��wait���߳����»�ȡ������
 * wait���ͷŶ�����������sleep���ᣬ���߶���ʹ�߳����ߣ�����ʱ�ͷ�cpu
 * �ڲ������Ƚ�С������£�ʹ��synchronized�����ǲ������Ƚϴ������£�ʹ��lock�����ܱ�synchronized��
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
