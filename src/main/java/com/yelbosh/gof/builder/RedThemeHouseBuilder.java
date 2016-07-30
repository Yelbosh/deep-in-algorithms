package com.yelbosh.gof.builder;

public class RedThemeHouseBuilder implements HouseBuilder{
	House house;
	
	public RedThemeHouseBuilder(){
		this.house = new House();
	}

	public void BuildRoom(int roomNo) {
		// TODO Auto-generated method stub
		System.out.println("build a red red room");
		house.roomNumber++;
	}

	public void BuildDoor(int room1, int room2) {
		// TODO Auto-generated method stub
		System.out.println("build a red red door");
		house.doorNumber++;
	}

	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}
	
}
