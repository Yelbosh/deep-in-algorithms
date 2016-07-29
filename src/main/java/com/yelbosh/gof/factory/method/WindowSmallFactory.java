package com.yelbosh.gof.factory.method;

public class WindowSmallFactory extends Factory{

	@Override
	public Window makeWindow() {
		// TODO Auto-generated method stub
		return new WindowSmall();
	}

}
