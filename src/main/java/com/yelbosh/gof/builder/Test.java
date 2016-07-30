package com.yelbosh.gof.builder;

public class Test {
	public static void main(String[] args){
		HouseDirector director = new HouseDirector();
		//建造一个蓝房子
		BlueThemeHouseBuilder builder1 = new BlueThemeHouseBuilder();
		director.CreateHouse(builder1);
		//建造一个红房子
		RedThemeHouseBuilder builder2 = new RedThemeHouseBuilder();
		director.CreateHouse(builder2);
	}
}
