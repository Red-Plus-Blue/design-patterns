package com.red.plus.blue.design_patterns.memento.concept;

public class Demo {

	public static void main(String[] args) {
		
		var originator = new Originator();
		var orignalState = originator.createMemento();
		
		originator.setString("Hello, world");
		
		originator.printString();
		originator.printString();
		originator.printString();
		
		originator.setMemento(orignalState);
		
		originator.printString();
		
	}
	
}
