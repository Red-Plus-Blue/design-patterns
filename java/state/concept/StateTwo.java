package com.red.plus.blue.design_patterns.state.concept;

public class StateTwo extends State {

	@Override
	public void goNext(Context context) {
		context.setState(new StateThree());
	}
	
	@Override
	public void doSomething() {
		System.out.println("Doing something in State Two");
	}

}
