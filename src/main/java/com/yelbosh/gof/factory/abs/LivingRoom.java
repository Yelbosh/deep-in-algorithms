package com.yelbosh.gof.factory.abs;

/**
 * һ��������ľ���ʵ��
 * @author Yabo
 *
 */
public class LivingRoom extends Room{

	@Override
	public Window makeWindow() {
		// TODO Auto-generated method stub
		return new LivingRoomWindow();
	}

	@Override
	public Door makeDoor() {
		// TODO Auto-generated method stub
		return new LivingRoomDoor();
	}

}
