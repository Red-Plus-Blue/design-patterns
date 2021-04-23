package com.red.plus.blue.design_patterns.command.concept;

public class Demo {
	
	public static void main(String[] args) {
		var receiver = new Receiver();
		var commandOne = new CommandOne(receiver);
		var commandTwo = new CommandTwo(receiver);
		
		commandOne.run();
		commandTwo.run();
	}

}
