package com.yelbosh.gof.prototype;

/**
 * ʹ��ԭ��ģʽ���ƶ��󲻻������Ĺ��췽��,��ֱ�Ӳ����ڴ��еĶ����������ر��Ǹ��ƴ����ʱ�����ܵĲ��ǳ�����
 * @author Yabo
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype cp = new ConcretePrototype();  
        for(int i=0; i< 10; i++){  
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
            clonecp.show();  
        }  
	}

}
