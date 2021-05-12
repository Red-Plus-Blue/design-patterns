package com.red.plus.blue.design_patterns.visitor.concrete;

public class MidpointCalculator implements Visitor {

	@Override
	public void visit(Square square) {
		var x = (square.width() / 2.0) + square.upperLeftX();
		var y = (square.height() / 2.0) + square.upperLeftY();
		System.out.println(String.format("Midpoint of square: (%.2f, %.2f)", x, y));
	}

	@Override
	public void visit(Circle circle) {
		var x = (circle.radius() / 2.0) + circle.upperLeftX();
		var y = (circle.radius() / 2.0) + circle.upperLeftY();
		System.out.println(String.format("Midpoint of circle: (%.2f, %.2f)", x, y));
	}

}
