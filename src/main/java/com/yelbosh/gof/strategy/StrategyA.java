package com.yelbosh.gof.strategy;

/**
 * 按照行定宽打印
 * @author Yabo
 *
 */
public class StrategyA implements Strategy {

	public void drawText(String text, int lineWidth, int lineCount) {
		// TODO Auto-generated method stub
		if(lineWidth > 0) {
            int len = text.length();
            int start = 0;
            System.out.println("----- String length is :" + len + ", line width is :" + lineWidth);
            while(len > 0) {
                if(len <= lineWidth) {
                    System.out.println(text.substring(start));
                } else {
                    System.out.println(text.substring(start, start+lineWidth));
                }
                len = len - lineWidth;
                start += lineWidth;
            }
        } else {
            System.out.println("line width can not < 1 !");
        }
	}

}
