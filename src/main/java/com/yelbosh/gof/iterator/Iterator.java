package com.yelbosh.gof.iterator;

/**
 * ����������ӿ�
 * @author Yabo
 *
 */
public interface Iterator {
	public void First(); //�α�ص�����
	public void Next(); //�α�������
	public boolean IsDone(); //�Ƿ��������
	public void CurrentItem(); //�����ǰ���ַ���
}
