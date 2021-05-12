package com.red.plus.blue.design_patterns.visitor.concrete;

public interface Visitor {

	void visit(Square square);
	
	void visit(Circle circle);
	
}
