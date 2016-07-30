package com.yelbosh.gof.builder;

/**
 * Ω®‘Ï ¶
 * @author Yabo
 *
 */
public interface HouseBuilder {
	public abstract void BuildRoom(int roomNo);
    public abstract void BuildDoor(int room1, int room2);
    public abstract House getHouse();
}

