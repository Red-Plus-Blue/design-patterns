package com.red.plus.blue.design_patterns.state.concrete;

public class ModerationState implements State {

	@Override
	public void publish(Document document) {
		document.state = new PublishedState();
	}

	@Override
	public void edit() {
		System.out.println("Editing in moderation state");
	}

}
