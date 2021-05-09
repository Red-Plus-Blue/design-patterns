package com.red.plus.blue.design_patterns.strategy.concept;

public class Demo {
	
	public static void main(String[] args) {
		var contextOne = new Context(new ImplementationOne());
		var contextTwo = new Context(new ImplementationTwo());
		
		contextOne.runAlgorithm();
		contextTwo.runAlgorithm();
	}

}
