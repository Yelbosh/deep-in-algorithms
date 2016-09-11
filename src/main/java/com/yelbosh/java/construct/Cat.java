package com.yelbosh.java.construct;

/**
 * 非静态块中的代码和定义时的初始化代码实际上是被拿到cat的构造函数中
 * 其赋值顺序确实是按照源程序中的代码顺序进行的
 * @author Yabo
 *
 */
public class Cat {
	String name;
    int age;
    //使用构造器初始化name，age两个实例变量
    public Cat(String name, int age){
    	System.out.println("执行构造器");
    	this.name=name;
    	this.age=age;
    }
 
    {
    	System.out.println("执行非静态初始化块"); //无法引用类成员
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
