package com.red.plus.blue.design_patterns.chain_of_responsibility.concrete;

public abstract class MoneyHandler {

	// name is used to make the output clearer, not part of the pattern
	protected String name;
	protected MoneyHandler next;
	
	protected MoneyHandler(String name) {
		this.name = name;
	}
	
	protected MoneyHandler(String name, MoneyHandler next) {
		this.name = name;
		this.next = next;
	}
	
	public void handle(int remainingAmount) {
		if(next != null) {
			next.handle(remainingAmount);
		} else {
			print("%s: No handler after this one. Processing done.", name);
		}
	}
	
	// convenience method for printing, not part of the pattern
	protected static void print(String message, Object... args) {
		System.out.println(String.format(message, args));
	}
	
}
