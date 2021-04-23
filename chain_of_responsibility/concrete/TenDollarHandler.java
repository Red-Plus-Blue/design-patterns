package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public class TenDollarHandler extends MoneyHandler {

	protected TenDollarHandler(String name) {
		super(name);
	}
	
	protected TenDollarHandler(String name, MoneyHandler next) {
		super(name, next);
	}
	
	public void handle(int remainingAmount) {
		// ! NOTE ! -- I am aware that this can be simplified, see: Demo.java
		while(remainingAmount >= 10) {
			remainingAmount -= 10;
			print("%s: Dispensing $10", name);
		}
		super.handle(remainingAmount);
	}

}
