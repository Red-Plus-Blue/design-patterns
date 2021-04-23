package com.red.plus.blue.design_patterns.chain_of_responsibility.concept;

public class Demo {
	
	public static void main(String[] args) {
		
		var second 	= new HandlerTwo("Second");
		var first 	= new HandlerOne("First", second);

		first.handle();
	}

}
