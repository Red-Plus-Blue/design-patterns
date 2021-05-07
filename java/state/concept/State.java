package com.red.plus.blue.design_patterns.state.concept;

public abstract class State {
	
	public abstract void goNext(Context context);
	
	public abstract void doSomething();
}
