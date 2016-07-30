package com.yelbosh.gof.builder;

public class BlueThemeHouseBuilder implements HouseBuilder{
	House house;
	
	public BlueThemeHouseBuilder(){
		this.house = new House();
	}

	public void BuildRoom(int roomNo) {
		// TODO Auto-generated method stub
		System.out.println("build a blue theme room");
		house.roomNumber++;
	}

	public void BuildDoor(int room1, int room2) {
		// TODO Auto-generated method stub
		System.out.println("build a blue theme door");
		house.doorNumber++;
	}

	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}
	
}
