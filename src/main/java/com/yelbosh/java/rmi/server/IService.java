package com.yelbosh.java.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IService extends Remote {
	//服务端要实现的接口方法
	String service(String content) throws RemoteException;
}
