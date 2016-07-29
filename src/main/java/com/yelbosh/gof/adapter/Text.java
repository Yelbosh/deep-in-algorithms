package com.yelbosh.gof.adapter;

/**
 * The Adaptee: 需要进行适配的方法接口
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

