package com.yelbosh.java.threadpool;

import java.util.Date;

public abstract class Task implements Runnable {
	private Date generateTime = null; //����ʱ��
	private Date submitTime = null; //�ύʱ��
	private Date beginExceuteTime = null; //��ʼִ��ʱ��
	private Date finishTime = null; //ִ�����ʱ��
	private long taskId; //task��ID
	
	public Task() {
        this.generateTime = new Date();
    }

	//����ӿ�
	public abstract String info();
	protected abstract boolean needExecuteImmediate(); //�Ƿ���Ҫ����ִ��
	public abstract void execTransaction() throws InterruptedException;

	public void run() {
		// TODO Auto-generated method stub
		try{
			execTransaction(); //ִ�д��벿��
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Date getGenerateTime() {
        return generateTime;
    }

    public Date getBeginExceuteTime() {
        return beginExceuteTime;
    }

    public void setBeginExceuteTime(Date beginExceuteTime) {
        this.beginExceuteTime = beginExceuteTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

}
