package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public class OneDollarHandler extends MoneyHandler {

	protected OneDollarHandler(String name) {
		super(name);
	}
	
	protected OneDollarHandler(String name, MoneyHandler next) {
		super(name, next);
	}
	
	public void handle(int remainingAmount) {
		// ! NOTE ! -- I am aware that this can be simplified, see: Demo.java
		while(remainingAmount >= 1) {
			remainingAmount -= 1;
			print("%s: Dispensing $1", name);
		}
		super.handle(remainingAmount);
	}

}
