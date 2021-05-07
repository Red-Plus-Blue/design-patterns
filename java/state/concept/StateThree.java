package com.red.plus.blue.design_patterns.state.concept;

public class StateThree extends State {

	@Override
	public void goNext(Context context) {
		context.setState(new StateOne());
	}
	
	@Override
	public void doSomething() {
		System.out.println("Doing something in State Three");
	}

}
