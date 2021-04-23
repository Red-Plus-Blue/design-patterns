package com.red.plus.blue.design_patterns.command.concrete;

public abstract class Command {
	
	protected Editor editor;

	public Command(Editor editor) {
		this.editor = editor;
	}
	
	public abstract void run();

}
