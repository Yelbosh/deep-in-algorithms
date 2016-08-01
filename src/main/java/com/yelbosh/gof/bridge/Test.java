package com.yelbosh.gof.bridge;

/**
 * 桥接模式，用于将高维度的类降维处理，符合类的单一职责原则
 * 这里要解决的问题是，不同系统上的不同样式的字体的显示，如果封装到一个类里面，则引起类变化的原因就是两个，现在用桥接模式变为一个
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
