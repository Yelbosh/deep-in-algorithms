package com.yelbosh.gof.iterator;

/**
 * 迭代器模式，适合于，不希望暴露集合的内部数据，便完成集合的遍历
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
