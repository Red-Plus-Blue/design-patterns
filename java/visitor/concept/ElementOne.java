package com.red.plus.blue.design_patterns.visitor.concept;

public class ElementOne implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
