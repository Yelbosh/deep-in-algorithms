package com.yelbosh.java.construct;

/**
 * �Ǿ�̬���еĴ���Ͷ���ʱ�ĳ�ʼ������ʵ�����Ǳ��õ�cat�Ĺ��캯����
 * �丳ֵ˳��ȷʵ�ǰ���Դ�����еĴ���˳����е�
 * @author Yabo
 *
 */
public class Cat {
	String name;
    int age;
    //ʹ�ù�������ʼ��name��age����ʵ������
    public Cat(String name, int age){
    	System.out.println("ִ�й�����");
    	this.name=name;
    	this.age=age;
    }
 
    {
    	System.out.println("ִ�зǾ�̬��ʼ����"); //�޷��������Ա
    	weight=2.0;
    }
    
    double weight=2.3;
    
    public String tostring(){
        return  "Cat[name="+name+",age="+age+",weigth="+weight+"]";
    }
    
    public static void main(String [] args){
    	Cat cat=new Cat("kitty",2);
    	System.out.println(cat.tostring());
    }
    
}
