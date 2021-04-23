package com.red.plus.blue.design_patterns.command.concept;

public class CommandOne extends Command {

	public CommandOne(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void run() {
		receiver.operationOne();
	}

}
