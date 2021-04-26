package com.red.plus.blue.design_patterns.interpreter.concrete;

public class TerminalExpression implements Expression {

	protected String value;
	
	public TerminalExpression(String value) {
		this.value = value;
	}
	
	@Override
	public void solve(Context context) {
		context.appendSolution(value);
	}

}
