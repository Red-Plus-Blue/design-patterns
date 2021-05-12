package com.red.plus.blue.design_patterns.visitor.concept;

public class VisitorOne implements Visitor {

	@Override
	public void visit(ElementOne element) {
		System.out.println("VisitorOne => ElementOne");
	}

	@Override
	public void visit(ElementTwo element) {
		System.out.println("VisitorOne => ElementTwo");
	}

}
