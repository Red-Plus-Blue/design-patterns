package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public class FiveDollarHandler extends MoneyHandler {

	protected FiveDollarHandler(String name) {
		super(name);
	}
	
	protected FiveDollarHandler(String name, MoneyHandler next) {
		super(name, next);
	}
	
	public void handle(int remainingAmount) {
		// ! NOTE ! -- I am aware that this can be simplified, see: Demo.java
		while(remainingAmount >= 5) {
			remainingAmount -= 5;
			print("%s: Dispensing $5", name);
		}
		super.handle(remainingAmount);
	}

}
