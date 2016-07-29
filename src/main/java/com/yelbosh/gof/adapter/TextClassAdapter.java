package com.yelbosh.gof.adapter;

import com.yelbosh.gof.chainofresponsibility.Manager;
import com.yelbosh.gof.chainofresponsibility.Others;
import com.yelbosh.gof.chainofresponsibility.PM;
import com.yelbosh.gof.chainofresponsibility.Programmer;
import com.yelbosh.gof.chainofresponsibility.QA;

/**
 * 类适配器，说白了就是利用多继承或者多接口实现，来增加需要适配的接口即可
 * @author Yabo
 *
 */
public class TextClassAdapter extends Text implements Shape{

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("class adapter draw");
	}

	public void border() {
		// TODO Auto-generated method stub
		System.out.println("class adapter border");
	}
	
	public static void main(String[] args){
		TextClassAdapter adapter = new TextClassAdapter();
		adapter.setText("My Love");
		System.out.println(adapter.getText());
	}
	
}
