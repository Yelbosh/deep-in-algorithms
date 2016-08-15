package com.yelbosh.java.threadpool;

import java.util.Date;

public abstract class Task implements Runnable {
	private Date generateTime = null; //产生时间
	private Date submitTime = null; //提交时间
	private Date beginExceuteTime = null; //开始执行时间
	private Date finishTime = null; //执行完成时间
	private long taskId; //task的ID
	
	public Task() {
        this.generateTime = new Date();
    }

	//抽象接口
	public abstract String info();
	protected abstract boolean needExecuteImmediate(); //是否需要立即执行
	public abstract void execTransaction() throws InterruptedException;

	public void run() {
		// TODO Auto-generated method stub
		try{
			execTransaction(); //执行代码部分
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
