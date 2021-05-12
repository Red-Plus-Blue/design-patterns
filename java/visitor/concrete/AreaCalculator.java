package com.red.plus.blue.design_patterns.visitor.concrete;

public class AreaCalculator implements Visitor {

	@Override
	public void visit(Square square) {
		var area = square.width() * square.height();
		System.out.println(String.format("Area of a square: %d", area));
	}

	@Override
	public void visit(Circle circle) {
		var area = 3.14 * Math.pow(circle.radius(), 2);
		System.out.println(String.format("Area of a circle: %.2f", area));
	}

}
