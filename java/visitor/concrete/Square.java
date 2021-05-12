package com.red.plus.blue.design_patterns.visitor.concrete;

public class Square extends Shape {
	
	protected int width;
	protected int height;
	
	public int width() { return this.width; }
	public int height() { return this.height; }
	
	public Square(int upperLeftX, int upperLeftY, int width, int height) {
		super(upperLeftX, upperLeftY);
		this.width = width;
		this.height = height;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
