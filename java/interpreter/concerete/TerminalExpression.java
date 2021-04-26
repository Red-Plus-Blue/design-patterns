package com.red.plus.blue.design_patterns.interpreter.concerete;

public class TerminalExpression implements Expression {

	protected int value = 0;
	
	public TerminalExpression(int value) {
		this.value = value;
	}
	
	@Override
	public void solve(Context context) {
		context.appendSolution(value);
	}

}
