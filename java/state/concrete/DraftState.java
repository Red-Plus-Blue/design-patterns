package com.red.plus.blue.design_patterns.state.concrete;

public class DraftState implements State {

	@Override
	public void publish(Document document) {
		document.state = new ModerationState();
	}

	@Override
	public void edit() {
		System.out.println("Editing in draft state");
	}

}
