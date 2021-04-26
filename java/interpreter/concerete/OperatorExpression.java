package com.red.plus.blue.design_patterns.interpreter.concerete;

import java.util.function.BiFunction;

public class OperatorExpression extends CompoundExpression {
	
	public static OperatorExpression Plus(Expression left, Expression right) { return new OperatorExpression((l, r) -> l + r, left, right); }
	public static OperatorExpression Mulitply(Expression left, Expression right) { return new OperatorExpression((l, r) -> l * r, left, right); }
	
	protected BiFunction<Integer, Integer, Integer> operation;
	
	protected OperatorExpression(BiFunction<Integer, Integer, Integer> operation, Expression left, Expression right) {
		super(left, right);
		this.operation = operation;
	}

	@Override
	public void solve(Context context) {
		var leftContext = new Context();
		left.solve(leftContext);
		
		var rightContext = new Context();
		right.solve(rightContext);
		
		var value = operation.apply(leftContext.solution, rightContext.solution);
		context.appendSolution(value);
	}

}
