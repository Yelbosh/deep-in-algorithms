package com.yelbosh.java.threadpool;

/**
 * 线程池的使用,主要就是当：线程创建时间+线程销毁时间>线程执行时间的时候，可以在程序运行时直接初始化线程池中德线程，而在最后再销毁
 * 便于线程的管理，也便于更加高效的执行线程中的task
 * @author Yabo
 */
public class PoolTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ConcreteTask1 task1 = new ConcreteTask1(100); //打印1到100
		ConcreteTask1 task2 = new ConcreteTask1(50); //打印1到50
		ConcreteTask1 task3 = new ConcreteTask1(10); //打印1到10
		ConcreteTask2 task4 = new ConcreteTask2("woaiqiuzi"); //字符串序列
		ConcreteTask2 task5 = new ConcreteTask2("aisinilemyautumn"); //字符串序列
		ThreadPool pool = ThreadPool.getInstance();
		pool.addTask(task1);pool.addTask(task2);
		System.out.println(pool.getInfo());
		pool.addTask(task3);pool.addTask(task4);
		System.out.println(pool.getInfo());
		Thread.sleep(1000);
		pool.addTask(task5);
		System.out.println(pool.getInfo());
		pool.destroy();
	}

}
