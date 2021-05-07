package com.red.plus.blue.design_patterns.state.concept;

public class StateOne extends State {

	@Override
	public void goNext(Context context) {
		context.setState(new StateTwo());
	}

	@Override
	public void doSomething() {
		System.out.println("Doing something in State One");
	}

}
