package com.yelbosh.gof.iterator;

/**
 * ������ģʽ���ʺ��ڣ���ϣ����¶���ϵ��ڲ����ݣ�����ɼ��ϵı���
 * @author Yabo
 *
 */
public class Test {
	public static void main(String[] args){
		DataVector dv = new DataVector();
		Iterator ite = dv.CreateIterator();
		for(ite.First(); ! ite.IsDone(); ite.Next()) {
			ite.CurrentItem();
        }
	}
}
