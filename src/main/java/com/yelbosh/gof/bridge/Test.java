package com.yelbosh.gof.bridge;

/**
 * �Ž�ģʽ�����ڽ���ά�ȵ��ཱུά����������ĵ�һְ��ԭ��
 * ����Ҫ����������ǣ���ͬϵͳ�ϵĲ�ͬ��ʽ���������ʾ�������װ��һ�������棬��������仯��ԭ������������������Ž�ģʽ��Ϊһ��
 * @author Yabo
 *
 */
public class Test {
	public static void main(String[] args){
		Text myText = new TextBold("Mac");
        myText.DrawText("=== A test String ===");

        myText =  new TextBold("Linux");
        myText.DrawText("=== A test String ===");

	}
}
