package com.yelbosh.java.threadpool;

/**
 * 实现的task的具体类
 * @author Yabo
 *
 */
public class ConcreteTask1 extends Task{
	private int count;
	
	public ConcreteTask1(int count) {
		super();
		this.count = count;
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
		for(int i=0;i<count;i++){
			Thread.sleep(100);
			System.out.print(i + " ");
		}
		System.out.println(" ");
	}

}
