package com.yelbosh.gof.bridge;

public abstract class Text {
	public abstract void DrawText(String text);
    protected TextImpl GetTextImp(String type) {
        if(type.equals("Mac")) {
            return new TextImpMac();
        } else if(type.equals("Linux")) {
            return new TextImpLinux();
        } else {
            return new TextImpMac();
        }
    }
}
