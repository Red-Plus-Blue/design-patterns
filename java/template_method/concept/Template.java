package com.red.plus.blue.design_patterns.template_method.concept;

public abstract class Template {
	
	public void algorithm() {
		stepOne();
		stepTwo();
		stepThree();
	}
	
	protected void stepOne() {
		System.out.println("Executing default step one");
	}
	
	protected void stepTwo() {
		System.out.println("Executing default step two");
	}

	protected void stepThree() {
		System.out.println("Executing default step three");
	}
}
