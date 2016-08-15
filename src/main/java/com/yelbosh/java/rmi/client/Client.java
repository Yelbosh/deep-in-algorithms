package com.yelbosh.java.rmi.client;

import java.rmi.Naming;

import com.yelbosh.java.rmi.server.IService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url = "rmi://localhost:8888/";
	     try {
	    	 // 在RMI服务注册表中查找名称为service02的对象，并调用其上的方法
	    	 IService service01 =(IService) Naming.lookup(url + "service01");
	    	 
	    	 Class stubClass = service01.getClass();
	         System.out.println(service01 + " 是 " + stubClass.getName() + " 的实例！");
	         // 获得本底存根已实现的接口类型
	         Class[] interfaces = stubClass.getInterfaces();
	         for (Class c : interfaces) {
	        	 System.out.println("存根类实现了 " + c.getName() + " 接口！");
	         }
	         System.out.println(service01.service("你好！"));
	     } catch (Exception e) {
	     	e.printStackTrace();
	     }
	   }
}
