package com.red.plus.blue.design_patterns.interpreter.concerete;

public class Demo {
	
	public static void main(String[] args) {
		
		var context = new Context();
		
		// Expression: a + (b * c);
		
		var a = new TerminalExpression(1);
		var b = new TerminalExpression(2);
		var c = new TerminalExpression(3);
		
		var expression = OperatorExpression.Plus(a, OperatorExpression.Mulitply(b, c));
		expression.solve(context);
		System.out.println(context.solution);
		
	}

}
