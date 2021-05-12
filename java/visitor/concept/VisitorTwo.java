package com.red.plus.blue.design_patterns.visitor.concept;

public class VisitorTwo implements Visitor {

	@Override
	public void visit(ElementOne element) {
		System.out.println("VisitorTwo => ElementOne");
	}

	@Override
	public void visit(ElementTwo element) {
		System.out.println("VisitorTwo => ElementTwo");
	}

}
