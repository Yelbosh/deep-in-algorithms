package com.yelbosh.gof.adapter;

/**
 * The Adaptee: ��Ҫ��������ķ����ӿ�
 * @author Yabo
 *
 */
public class Text {
	private String text;
	
	public Text(){}
	
	public void setText(String text){
		this.text = text;
	}
	
	public String getText(){
		return this.text;
	}
}

