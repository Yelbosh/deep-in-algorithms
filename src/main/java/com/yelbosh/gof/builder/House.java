package com.yelbosh.gof.builder;

public class House {
	int roomNumber;
    int doorNumber;
    
    public House() {
        roomNumber = 0;
        doorNumber = 0;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public int getDoorNumber() {
        return doorNumber;
    }
}
