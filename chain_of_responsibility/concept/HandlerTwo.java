package com.red.plus.blue.design_patterns.chain_of_responsibility.concept;

public class HandlerTwo extends AbstractHandler {

	public HandlerTwo(String name) {
		this.name = name;
	}
	
	public HandlerTwo(String name, AbstractHandler next) {
		this.name = name;
		this.next = next;
	}
	
	@Override
	public void handle() {
		print("%s: HandlerTwo handling request", name);
	}

}