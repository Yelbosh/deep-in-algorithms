package com.yelbosh.java.threadpool;

/**
 * 实现的task的具体类
 * @author Yabo
 *
 */
public class ConcreteTask2 extends Task{
	private String key;
	
	public ConcreteTask2(String key) {
		super();
		this.key = key;
	}
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "this is task 1";
	}

	@Override
	protected boolean needExecuteImmediate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void execTransaction() throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<key.length();i++){
			Thread.sleep(100);
			System.out.print(key.substring(0, i) + " ");
		}
		System.out.println(" ");
	}

}
