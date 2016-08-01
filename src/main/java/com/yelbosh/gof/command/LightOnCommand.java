package com.yelbosh.gof.command;

public class LightOnCommand implements Command{
	
	private Light myLight;
	
    public LightOnCommand (Light L) {
           myLight = L;
    }
    public void execute() {
           myLight.turnOn();
    }
	
}
