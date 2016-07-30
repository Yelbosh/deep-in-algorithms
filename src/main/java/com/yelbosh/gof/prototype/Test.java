package com.yelbosh.gof.prototype;

/**
 * 使用原型模式复制对象不会调用类的构造方法,它直接操作内存中的二进制流，特别是复制大对象时，性能的差别非常明显
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
