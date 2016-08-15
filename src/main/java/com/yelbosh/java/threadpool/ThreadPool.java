package com.yelbosh.java.threadpool;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

public class ThreadPool {
	private static Logger logger = Logger.getLogger(ThreadPool.class);
    private static Logger taskLogger = Logger.getLogger("TaskLogger");
    private static boolean debug = taskLogger.isDebugEnabled();
    //单例模式
    private static ThreadPool instance = ThreadPool.getInstance();
    public static final int SYSTEM_BUSY_TASK_COUNT = 150;
    public static int worker_num = 5; //默认线程数
    private static int taskCounter = 0; //已处理任务数
    public static boolean systemIsBusy = false;
    private static List<Task> taskQueue = Collections.synchronizedList(new LinkedList<Task>());
    public PoolWorker[] workers; //所有线程数组
    
    private ThreadPool() {
        workers = new PoolWorker[5];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new PoolWorker(this, i);
        }
    }
    
    public List<Task> getTaskQueue(){
    	return taskQueue;
    }
    
    public boolean isDebug(){
    	return debug;
    }
    
    public Logger getTaskLogger(){
    	return taskLogger;
    }
    
    private ThreadPool(int pool_worker_num) {
        worker_num = pool_worker_num;
        workers = new PoolWorker[worker_num];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new PoolWorker(this, i);
        }
    }
    
    //单利模式函数
    public static synchronized ThreadPool getInstance() {
        if (instance == null)
            return new ThreadPool();
        return instance;
    }
    
    //添加单个task
    public void addTask(Task newTask) {
        synchronized (taskQueue) {
            newTask.setTaskId(++taskCounter);
            newTask.setSubmitTime(new Date());
            taskQueue.add(newTask);
            taskQueue.notifyAll(); //唤醒队列, 开始执行
        }
        logger.info("Submit Task<" + newTask.getTaskId() + ">: " + newTask.info());
    }
    
    //批量添加task
    public void batchAddTask(Task[] taskes) {
        if (taskes == null || taskes.length == 0) {
            return;
        }
        synchronized (taskQueue) {
            for (int i = 0; i < taskes.length; i++) {
                if (taskes[i] == null) {
                    continue;
                }
                taskes[i].setTaskId(++taskCounter);
                taskes[i].setSubmitTime(new Date());
                taskQueue.add(taskes[i]);
            }
            taskQueue.notifyAll();//唤醒队列,开始执行 
        }
        for (int i = 0; i < taskes.length; i++) {
            if (taskes[i] == null) {
                continue;
            }
            logger.info("Submit Task<" + taskes[i].getTaskId() + ">: "
                    + taskes[i].info());
        }
    }
    
    //获取线程池信息
    public String getInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nTask Queue Size:" + taskQueue.size());
        for (int i = 0; i < workers.length; i++) {
            sb.append("\nWorker " + i + " is "
                    + ((workers[i].isWaiting()) ? "Waiting." : "Running."));
        }
        return sb.toString();
    }
    
    //销毁线程池
    public synchronized void destroy() {
        for (int i = 0; i < worker_num; i++) {
            workers[i].stopWorker();
            workers[i] = null;
        }
        taskQueue.clear();
    }
}
