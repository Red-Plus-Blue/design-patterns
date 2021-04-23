package com.red.plus.blue.design_patterns.command.concrete;

public class Demo {
	
	public static void main(String[] args) {
		var editor = new Editor();
		var copy = new CopyCommand(editor);
		var paste = new PasteCommand(editor);
		
		editor.setContent("Lorem Ipsum");
		editor.printState();
		copy.run();
		editor.setContent("");
		editor.printState();
		paste.run();
		editor.printState();
	}

}
