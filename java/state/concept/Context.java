package com.red.plus.blue.design_patterns.state.concept;

public class Context {
	
	protected State current = new StateOne();
	
	public void goNext() {
		current.goNext(this);
	}
	
	public void setState(State state) {
		this.current = state;
	}
	
	public void doSomething() {
		current.doSomething();
	}

}
