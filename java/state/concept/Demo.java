package com.red.plus.blue.design_patterns.state.concept;

public class Demo {
	
	public static void main(String[] args) {
		var context = new Context();
		context.doSomething();
		context.goNext();
		context.doSomething();
		context.goNext();
		context.doSomething();
	}

}
