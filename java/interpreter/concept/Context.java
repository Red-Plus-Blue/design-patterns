package com.red.plus.blue.design_patterns.interpreter.concrete;

public class Context {

	protected String solution = "";
	
	public void appendSolution(String value) {
		solution += value;
	}
	
	public String getSolution() {
		return solution;
	}
	
}
