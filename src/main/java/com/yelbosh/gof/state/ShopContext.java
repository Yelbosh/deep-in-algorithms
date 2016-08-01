package com.yelbosh.gof.state;

public class ShopContext {
	private ShopState currentState;
    public ShopContext() {
    }
    public void changeState(ShopState s) {
        currentState = s;
    }
    public void shop() {
        currentState.shop();
    }
    public void generateBill() {
        currentState.generateBill();
    }
    public void pay() {
        currentState.pay();
    }
}
