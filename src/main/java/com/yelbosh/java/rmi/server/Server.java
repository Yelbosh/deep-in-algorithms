package com.yelbosh.java.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    	// 实例化实现了IService接口的远程服务ServiceImpl对象
			IService service01 = new ServiceImpl("service01");
			// 本地主机上的远程对象注册表Registry的实例，并指定端口为8888，这一步必不可少（Java默认端口是1099），必不可缺的一步，缺少注册表创建，则无法绑定对象到远程注册表上
	        LocateRegistry.createRegistry(8888);
	        // 把远程对象注册到RMI注册服务器上，并命名为service01
	        //绑定的URL标准格式为：rmi://host:port/name(其中协议名可以省略，下面两种写法都是正确的）
	        Naming.bind("rmi://localhost:8888/service01",service01);
		} catch (Exception e) {
	    	e.printStackTrace();
	    }
		System.out.println("服务器向命名表注册了1个远程服务对象！");
	}

}
