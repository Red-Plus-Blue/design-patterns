package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public class FiftyDollarHandler extends MoneyHandler {

	protected FiftyDollarHandler(String name) {
		super(name);
	}
	
	protected FiftyDollarHandler(String name, MoneyHandler next) {
		super(name, next);
	}
	
	public void handle(int remainingAmount) {
		// ! NOTE ! -- I am aware that this can be simplified, see: Demo.java
		while(remainingAmount >= 50) {
			remainingAmount -= 50;
			print("%s: Dispensing $50", name);
		}
		super.handle(remainingAmount);
	}

}
