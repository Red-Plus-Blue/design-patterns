package com.red.plus.blue.design_patterns.visitor.concrete;

public class Circle extends Shape {
	
	protected int radius;
	
	public int radius() { return this.radius; }
	
	public Circle(int upperLeftX, int upperLeftY, int radius) {
		super(upperLeftX, upperLeftY);
		this.radius = radius;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
