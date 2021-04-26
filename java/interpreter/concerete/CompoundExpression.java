package com.red.plus.blue.design_patterns.interpreter.concerete;

public abstract class CompoundExpression implements Expression {
	
	protected Expression left;
	protected Expression right;

	public CompoundExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public abstract void solve(Context context);

}
