package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public class TwentyDollarHandler extends MoneyHandler {

	protected TwentyDollarHandler(String name) {
		super(name);
	}
	
	protected TwentyDollarHandler(String name, MoneyHandler next) {
		super(name, next);
	}
	
	public void handle(int remainingAmount) {
		// ! NOTE ! -- I am aware that this can be simplified, see: Demo.java
		while(remainingAmount >= 20) {
			remainingAmount -= 20;
			print("%s: Dispensing $20", name);
		}
		super.handle(remainingAmount);
	}

}
