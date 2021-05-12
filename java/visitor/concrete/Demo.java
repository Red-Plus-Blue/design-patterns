package com.red.plus.blue.design_patterns.visitor.concrete;

public class Demo {
	
	public static void main(String[] args) {
		var circle = new Circle(5, 5, 1);
		var square = new Square(5, 5, 10, 10);
		
		square.accept(new AreaCalculator());
		circle.accept(new AreaCalculator());
		
		square.accept(new MidpointCalculator());
		circle.accept(new MidpointCalculator());
	}
}
