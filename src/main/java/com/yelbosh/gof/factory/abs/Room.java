package com.yelbosh.gof.factory.abs;

/**
 * ���󹤳���Ĺ��������࣬�����д�����������Ʒ��Ľӿ�
 * @author Yabo
 *
 */
public abstract class Room {
	public abstract Window makeWindow();
	public abstract Door makeDoor();
}
