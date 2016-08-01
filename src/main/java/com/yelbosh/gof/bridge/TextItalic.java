package com.yelbosh.gof.bridge;

public class TextItalic extends Text {
	
	private TextImpl impl;
	
	public TextItalic(String type) {
        impl = GetTextImp(type);
    }

	@Override
	public void DrawText(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
        System.out.println("The text is italic text!");
        impl.DrawTextImpl(text);
	}
	
}
