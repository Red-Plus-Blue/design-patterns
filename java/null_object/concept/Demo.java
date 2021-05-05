package com.red.plus.blue.design_patterns.null_object.concept;

public class Demo {

	public static void main(String[] args) {
		
		var realObject = new RealObject();
		realObject.doSomething();
		
		var nullObject = AbstractObject.empty();
		nullObject.doSomething();
		
	}
	
}
