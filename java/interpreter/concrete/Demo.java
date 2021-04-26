package com.red.plus.blue.design_patterns.interpreter.concrete;

public class Demo {
	
	public static void main(String[] args) {
		var one = new TerminalExpression("1");
		var two = new TerminalExpression("2");
		var plus = new CompoundExpression("+", one, two);
		var context = new Context();
		
		plus.solve(context);
		
		System.out.println(context.getSolution());
	}

}
