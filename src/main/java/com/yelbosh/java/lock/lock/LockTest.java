package com.yelbosh.java.lock.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.yelbosh.java.lock.lock.Consume;
import com.yelbosh.java.lock.lock.Produce;

public class LockTest {
	public static void main(String[] args){
		Lock lock = new ReentrantLock();
		(new Thread(new Produce(lock))).start();
		(new Thread(new Consume(lock))).start();
	}
}
