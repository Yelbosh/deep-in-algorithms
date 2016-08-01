package com.yelbosh.gof.command;

public class FanOffCommand implements Command{
	
	private Fan myFan;
	
    public FanOffCommand (Fan F) {
    	myFan = F;
    }
    public void execute() {
    	myFan.stopRotate();
    }
	
}
