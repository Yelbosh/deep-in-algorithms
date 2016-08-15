package com.yelbosh.java.rmi.client;

import java.rmi.Naming;

import com.yelbosh.java.rmi.server.IService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url = "rmi://localhost:8888/";
	     try {
	    	 // ��RMI����ע����в�������Ϊservice02�Ķ��󣬲��������ϵķ���
	    	 IService service01 =(IService) Naming.lookup(url + "service01");
	    	 
	    	 Class stubClass = service01.getClass();
	         System.out.println(service01 + " �� " + stubClass.getName() + " ��ʵ����");
	         // ��ñ��״����ʵ�ֵĽӿ�����
	         Class[] interfaces = stubClass.getInterfaces();
	         for (Class c : interfaces) {
	        	 System.out.println("�����ʵ���� " + c.getName() + " �ӿڣ�");
	         }
	         System.out.println(service01.service("��ã�"));
	     } catch (Exception e) {
	     	e.printStackTrace();
	     }
	   }
}
