package com.red.plus.blue.design_patterns.command.concept;

public abstract class Command {
	
	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void run();
}
