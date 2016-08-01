package com.yelbosh.gof.command;

/**
 * Ïàµ±ÓÚinvoker
 * @author Yabo
 *
 */
public class Switch {
	private Command UpCommand, DownCommand;
	
    public Switch (Command Up, Command Down) {
           UpCommand = Up;
           DownCommand = Down;
    }
    
    void flipUp() {
         UpCommand.execute();
    }
    
    void flipDown() {
         DownCommand.execute();
    }
}
