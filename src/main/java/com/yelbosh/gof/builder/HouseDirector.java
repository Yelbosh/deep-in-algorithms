package com.yelbosh.gof.builder;

/**
 * 形同神不同，根据builder建造不同的房子
 * 隐藏产品的内部表示，将构造代码和表示代码分开， 精确的控制导向产品的创建
 * @author Yabo
 *
 */
public class HouseDirector {
	public void CreateHouse(HouseBuilder concreteBuilder) {
		concreteBuilder.BuildRoom(1);
        concreteBuilder.BuildRoom(2);
        concreteBuilder.BuildDoor(1, 2);
	}
}
