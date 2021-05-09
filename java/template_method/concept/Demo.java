package com.red.plus.blue.design_patterns.template_method.concept;

public class Demo {
	
	public static void main(String[] args) {
		Template one = new ImplementationOne();
		one.algorithm();
		
		System.out.println("");
		
		Template two = new ImplementationTwo();
		two.algorithm();
	}

}
