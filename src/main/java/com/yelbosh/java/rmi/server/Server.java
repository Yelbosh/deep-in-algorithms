package com.yelbosh.java.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    	// ʵ����ʵ����IService�ӿڵ�Զ�̷���ServiceImpl����
			IService service01 = new ServiceImpl("service01");
			// ���������ϵ�Զ�̶���ע���Registry��ʵ������ָ���˿�Ϊ8888����һ���ز����٣�JavaĬ�϶˿���1099�����ز���ȱ��һ����ȱ��ע����������޷��󶨶���Զ��ע�����
	        LocateRegistry.createRegistry(8888);
	        // ��Զ�̶���ע�ᵽRMIע��������ϣ�������Ϊservice01
	        //�󶨵�URL��׼��ʽΪ��rmi://host:port/name(����Э��������ʡ�ԣ���������д��������ȷ�ģ�
	        Naming.bind("rmi://localhost:8888/service01",service01);
		} catch (Exception e) {
	    	e.printStackTrace();
	    }
		System.out.println("��������������ע����1��Զ�̷������");
	}

}
