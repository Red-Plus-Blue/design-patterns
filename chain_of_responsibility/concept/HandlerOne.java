package com.red.plus.blue.design_patterns.chain_of_responsibility.concept;

public class HandlerOne extends AbstractHandler {

	public HandlerOne(String name) {
		this.name = name;
	}
	
	public HandlerOne(String name, AbstractHandler next) {
		this.name = name;
		this.next = next;
	}
	
	@Override
	public void handle() {
		print("%s: HandlerOne ignoring request", name);
		super.handle();
	}

}
