package com.yelbosh.gof.decorator;

/**
 * 
 * װ����ģʽ������ԭ�����������չ���Ǵ���̳е�һ�ֽ�����������ұȼ̳и����������ڴ����Ͽ϶�û�м̳м�࣬��ΪҪ������decorator��дcomponent�ķ���
 * ����Ӧ�ã�java��InputStream��Writer�У������Զ�һЩ����װ�����á��磺
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
