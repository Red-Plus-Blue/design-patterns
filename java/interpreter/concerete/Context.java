package com.red.plus.blue.design_patterns.interpreter.concerete;

public class Context {

	protected int solution = 0;
	
	public void appendSolution(int value) {
		solution += value;
	}
	
	public int getSolution() {
		return solution;
	}
	
}
