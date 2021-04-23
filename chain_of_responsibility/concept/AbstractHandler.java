package com.red.plus.blue.design_patterns.chain_of_responsibility.concept;

public abstract class AbstractHandler {
	
	protected String name;
	protected AbstractHandler next;
	
	public void handle() {
		if(next != null) {
			next.handle();
		} else {
			print("%s: No handler after this one. Processing done.", name);
		}
	}
	
	protected void print(String message, Object... args) {
		System.out.println(String.format(message, args));
	}

}
