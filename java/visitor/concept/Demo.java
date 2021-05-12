package com.red.plus.blue.design_patterns.visitor.concept;

public class Demo {
	
	public static void main(String[] args) {
		Element elementOne = new ElementOne();
		Element elementTwo = new ElementTwo();
		Visitor visitorOne = new VisitorOne();
		Visitor visitorTwo = new VisitorTwo();
		
		elementOne.accept(visitorOne);
		elementOne.accept(visitorTwo);
		elementTwo.accept(visitorOne);
		elementTwo.accept(visitorTwo);
	}
}
