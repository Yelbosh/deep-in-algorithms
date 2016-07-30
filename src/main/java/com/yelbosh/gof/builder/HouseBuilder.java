package com.yelbosh.gof.builder;

/**
 * ����ʦ
 * @author Yabo
 *
 */
public interface HouseBuilder {
	public abstract void BuildRoom(int roomNo);
    public abstract void BuildDoor(int room1, int room2);
    public abstract House getHouse();
}

