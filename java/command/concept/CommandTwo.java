package com.red.plus.blue.design_patterns.command.concept;

public class CommandTwo extends Command {

	public CommandTwo(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void run() {
		receiver.operationTwo();
	}

}
