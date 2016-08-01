package com.yelbosh.gof.bridge;

public class TextBold extends Text {
	
	private TextImpl impl;
	
	public TextBold(String type) {
        impl = GetTextImp(type);
    }

	@Override
	public void DrawText(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
        System.out.println("The text is bold text!");
        impl.DrawTextImpl(text);
	}
	
}
