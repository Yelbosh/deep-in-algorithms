package com.yelbosh.java.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IService extends Remote {
	//�����Ҫʵ�ֵĽӿڷ���
	String service(String content) throws RemoteException;
}
