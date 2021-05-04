package com.red.plus.blue.design_patterns.memento.concrete;

public class Demo {

	public static void main(String[] args) {
		
		var editor = new Editor();
		editor.addLine("Hello");
		editor.addLine(", world");
		editor.addLine("Hello, world");
		
		editor.show();
		
		editor.moveCursor(-2);
		editor.cut();
		
		editor.show();
		
		editor.undo();
		
		editor.show();
		
		editor.undo();
		editor.undo();
		
		editor.show();
	}
	
}
