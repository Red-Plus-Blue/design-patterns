package com.red.plus.blue.design_patterns.state.concrete;

public class Document {
	
	protected State state = new DraftState();
	
	public void edit() {
		state.edit();
	}
	
	public void publish() {
		state.publish(this);
	}

}
