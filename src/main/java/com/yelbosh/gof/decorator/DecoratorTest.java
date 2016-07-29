package com.yelbosh.gof.decorator;

/**
 * 
 * 装饰者模式用来对原来的类进行扩展，是代替继承的一种解决方案，而且比继承更加灵活，但是在代码上肯定没有继承简洁，因为要重新在decorator中写component的方法
 * 典型应用：java中InputStream和Writer中，流可以对一些流起到装饰作用。如：
 * FileReader fr = new FileReader(is); //is is input stream
 * @author Yabo
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component com = new ConcreteComponent();
		ConcreteDecorator dec = new ConcreteDecorator(com);
		dec.printStr2("hello world");
	}

}
