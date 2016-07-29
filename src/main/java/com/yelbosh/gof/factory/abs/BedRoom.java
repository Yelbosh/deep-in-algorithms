package com.yelbosh.gof.factory.abs;

/**
 * һ��������ľ���ʵ��
 * @author Yabo
 *
 */
public class BedRoom extends Room{

	@Override
	public Window makeWindow() {
		// TODO Auto-generated method stub
		return new BedRoomWindow();
	}

	@Override
	public Door makeDoor() {
		// TODO Auto-generated method stub
		return new BedRoomDoor();
	}

}
