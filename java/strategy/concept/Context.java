package com.red.plus.blue.design_patterns.strategy.concept;

public class Context {

	protected Algorithm algorithm;
	
	public Context(Algorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	
	public void runAlgorithm() {
		algorithm.run();
	}
	
}
