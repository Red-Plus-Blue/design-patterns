package com.red.plus.blue.design_patterns.visitor.concrete;

public abstract class Shape {

	protected int upperLeftX;
	protected int upperLeftY;
	
	public int upperLeftX() { return upperLeftX; }
	public int upperLeftY() { return upperLeftY; }
	
	protected Shape(int upperLeftX, int upperLeftY) {
		this.upperLeftX = upperLeftX;
		this.upperLeftY = upperLeftY;
	}
	
	void accept(Visitor visitor) { 
		// do nothing
	}
	
}
