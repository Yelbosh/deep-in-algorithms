package com.yelbosh.gof.state;

public class ShopState implements IShopState {

	public ShopState() {
		
    }
	
	public void shop() {
		// TODO Auto-generated method stub
		
	}

	public void generateBill() {
		// TODO Auto-generated method stub
		
	}

	public void pay() {
		// TODO Auto-generated method stub
		
	}
	
	protected void changeState(ShopContext c, ShopState s) {
        c.changeState(s);
    }

}
