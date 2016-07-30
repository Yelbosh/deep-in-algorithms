package com.yelbosh.gof.builder;

/**
 * ��ͬ��ͬ������builder���첻ͬ�ķ���
 * ���ز�Ʒ���ڲ���ʾ�����������ͱ�ʾ����ֿ��� ��ȷ�Ŀ��Ƶ����Ʒ�Ĵ���
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
