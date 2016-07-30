package com.yelbosh.gof.strategy;

/**
 * ª∑æ≥¿‡
 * @author Yabo
 *
 */
public class Context {
	private String text;
	private int lineWidth;
	private int lineCount;
	private Strategy strategy;
	
	public Context(){}
	
	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void setText(String s){
		this.text = s;
	}
	
	public void setLineWidth(int width){
		this.lineWidth = width;
	}
	
	public void setLineCount(int count){
		this.lineCount = count;
	}
	
	public void drawText(){
		this.strategy.drawText(text, lineWidth, lineCount);
	}
	
}
