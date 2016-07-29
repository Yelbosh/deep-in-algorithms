package com.yelbosh.gof.factory.abs;

public class AbsFactory {	
	public static void main(String[] args){
		Room living = new LivingRoom();
		Window window1 = living.makeWindow(); window1.func();
		Window window2 = living.makeWindow(); window2.func();
		Door door1 = living.makeDoor(); door1.func();
		
		Room bed = new BedRoom();
		Window window3 = bed.makeWindow(); window3.func();
		Window window4 = bed.makeWindow(); window4.func();
		Door door2 = bed.makeDoor(); door2.func();
	}
}
