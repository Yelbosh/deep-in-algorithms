package com.yelbosh.java.threadpool;

/**
 * �̳߳ص�ʹ��,��Ҫ���ǵ����̴߳���ʱ��+�߳�����ʱ��>�߳�ִ��ʱ���ʱ�򣬿����ڳ�������ʱֱ�ӳ�ʼ���̳߳��е��̣߳��������������
 * �����̵߳Ĺ���Ҳ���ڸ��Ӹ�Ч��ִ���߳��е�task
 * @author Yabo
 */
public class PoolTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ConcreteTask1 task1 = new ConcreteTask1(100); //��ӡ1��100
		ConcreteTask1 task2 = new ConcreteTask1(50); //��ӡ1��50
		ConcreteTask1 task3 = new ConcreteTask1(10); //��ӡ1��10
		ConcreteTask2 task4 = new ConcreteTask2("woaiqiuzi"); //�ַ�������
		ConcreteTask2 task5 = new ConcreteTask2("aisinilemyautumn"); //�ַ�������
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
