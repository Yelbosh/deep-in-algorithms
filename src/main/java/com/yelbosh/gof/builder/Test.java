package com.yelbosh.gof.builder;

public class Test {
	public static void main(String[] args){
		HouseDirector director = new HouseDirector();
		//����һ��������
		BlueThemeHouseBuilder builder1 = new BlueThemeHouseBuilder();
		director.CreateHouse(builder1);
		//����һ���췿��
		RedThemeHouseBuilder builder2 = new RedThemeHouseBuilder();
		director.CreateHouse(builder2);
	}
}
