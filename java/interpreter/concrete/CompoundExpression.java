package com.red.plus.blue.design_patterns.interpreter.concrete;

public class CompoundExpression implements Expression {
	
	protected String value;
	protected Expression left;
	protected Expression right;

	public CompoundExpression(String value, Expression left, Expression right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void solve(Context context) {
		left.solve(context);
		context.appendSolution(value);
		right.solve(context);
	}

}
