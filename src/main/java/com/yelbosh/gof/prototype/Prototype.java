package com.yelbosh.gof.prototype;

/**
 * ԭ��ģʽ��ԭ����
 * @author Yabo
 *
 */
public class Prototype implements Cloneable{
	
	public Prototype clone(){
		Prototype prototype = null;
		try{
			prototype = (Prototype)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return prototype;
	}
}
