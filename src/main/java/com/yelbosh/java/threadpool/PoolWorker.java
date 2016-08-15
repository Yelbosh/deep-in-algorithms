package com.yelbosh.java.threadpool;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

//线程池中的工作线程
public class PoolWorker extends Thread{
	private int index = -1;
	private boolean isRunning = true; //判断线程是否有效
	private boolean isWaiting = true; //判断是否可以执行新任务
	private ThreadPool poolInstance; //线程池引用
	private Logger taskLogger;
	
	public PoolWorker(ThreadPool pool, int index) {
		this.poolInstance = pool;
        this.index = index;
        this.taskLogger = pool.getTaskLogger();
        start();
    }
	
	public void stopWorker() {
        this.isRunning = false;
    }
	
	public boolean isWaiting() {
        return this.isWaiting;
    }

	@Override
	public void run() {
		while(isRunning){ //如果Worker在工作，则不断从队列中获取task
			Task r = null;
			List<Task> taskQueue = poolInstance.getTaskQueue();
			synchronized (taskQueue) { //对任务队列同步化
				while(taskQueue.isEmpty()){
					try{
						taskQueue.wait(20);
					}catch(InterruptedException ie){
						taskLogger.error(ie);
					}
				}
				r = taskQueue.remove(0);
			}
			//取出任务后，执行该任务
			if(r != null){
				isWaiting = false;
				try{
					if(poolInstance.isDebug()){ //调试状态则task信息
						r.setBeginExceuteTime(new Date());
                        taskLogger.debug("Worker<" + index + "> start execute Task<" + r.getTaskId() + ">");
                        if (r.getBeginExceuteTime().getTime() - r.getSubmitTime().getTime() > 1000)
                            taskLogger.debug("longer waiting time. "
                            		+ r.info() + ",<" + index + ">,time:"
                                    + (r.getFinishTime().getTime() - r.getBeginExceuteTime().getTime()));
					}
					if (r.needExecuteImmediate()) {
                        new Thread(r).start(); //需要立即执行，则新建线程执行，错误，没用
                    } else {
                        r.run(); //在该线程中执行该任务
                    }
					if (poolInstance.isDebug()) { //调试状态则task信息
                        r.setFinishTime(new Date());
                        taskLogger.debug("Worker<" + index + "> finish task<" + r.getTaskId() + ">");
                        if (r.getFinishTime().getTime() - r.getBeginExceuteTime().getTime() > 1000)
                            taskLogger.debug("longer execution time. "
                                    + r.info() + ",<" + index + ">,time:"
                                    + (r.getFinishTime().getTime() - r.getBeginExceuteTime().getTime()));
                    }
				}catch(Exception e){
					e.printStackTrace();
                    taskLogger.error(e);
				}
				isWaiting = true;
                r = null;
			}
		}
	}
	
	
}
