package com.yelbosh.gof.strategy;

/**
 * 策略类抽象接口
 * @author Yabo
 *
 */
public interface Strategy {
	public void drawText(String s, int lineWidth, int lineCount); //按照相应的策略打印文本
}
