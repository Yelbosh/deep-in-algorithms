package com.yelbosh.java.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImpl extends UnicastRemoteObject implements IService {

	private String name;
	 
	public ServiceImpl(String name) throws RemoteException {
		this.name = name;
	}
	   
	public String service(String content) throws RemoteException {
		// TODO Auto-generated method stub
		 return "server >> " + content;
	}
	
}
