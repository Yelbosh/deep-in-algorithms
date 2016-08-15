package com.yelbosh.java.threadpool;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

//�̳߳��еĹ����߳�
public class PoolWorker extends Thread{
	private int index = -1;
	private boolean isRunning = true; //�ж��߳��Ƿ���Ч
	private boolean isWaiting = true; //�ж��Ƿ����ִ��������
	private ThreadPool poolInstance; //�̳߳�����
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
		while(isRunning){ //���Worker�ڹ������򲻶ϴӶ����л�ȡtask
			Task r = null;
			List<Task> taskQueue = poolInstance.getTaskQueue();
			synchronized (taskQueue) { //���������ͬ����
				while(taskQueue.isEmpty()){
					try{
						taskQueue.wait(20);
					}catch(InterruptedException ie){
						taskLogger.error(ie);
					}
				}
				r = taskQueue.remove(0);
			}
			//ȡ�������ִ�и�����
			if(r != null){
				isWaiting = false;
				try{
					if(poolInstance.isDebug()){ //����״̬��task��Ϣ
						r.setBeginExceuteTime(new Date());
                        taskLogger.debug("Worker<" + index + "> start execute Task<" + r.getTaskId() + ">");
                        if (r.getBeginExceuteTime().getTime() - r.getSubmitTime().getTime() > 1000)
                            taskLogger.debug("longer waiting time. "
                            		+ r.info() + ",<" + index + ">,time:"
                                    + (r.getFinishTime().getTime() - r.getBeginExceuteTime().getTime()));
					}
					if (r.needExecuteImmediate()) {
                        new Thread(r).start(); //��Ҫ����ִ�У����½��߳�ִ�У�����û��
                    } else {
                        r.run(); //�ڸ��߳���ִ�и�����
                    }
					if (poolInstance.isDebug()) { //����״̬��task��Ϣ
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
