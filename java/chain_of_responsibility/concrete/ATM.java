package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public class ATM {

	private final MoneyHandler handler;
	
	public ATM() {
		var ones = new OneDollarHandler("One");
		var fives = new FiveDollarHandler("Five", ones);
		var tens = new TenDollarHandler("Ten", fives);
		var twenties = new TwentyDollarHandler("Twenty", tens);
		this.handler = new FiftyDollarHandler("Fifty", twenties);
	}
	
	public void dispense(int amount) {
		System.out.println("Initial amount: $" + amount);
		handler.handle(amount);
	}
	
}
