package com.red.plus.blue.design_patterns.state.concrete;

public class PublishedState implements State {

	@Override
	public void publish(Document document) {
		// do nothing
	}

	@Override
	public void edit() {
		System.out.println("Published: editing locked");
	}

}
