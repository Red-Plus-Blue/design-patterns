package com.red.plus.blue.design_patterns.memento.concrete;

import java.util.Queue;
import java.util.Stack;

public class Editor {

	protected Stack<Document.Snapshot> history = new Stack<>();
	protected Document document = new Document();
	
	public void addLine(String line) {
		history.push(document.getMemento());
		document.addLine(line);
	}
	
	public void cut() {
		history.push(document.getMemento());
		document.cut();
	}
	
	public void paste() {
		history.push(document.getMemento());
		document.paste();
	}
	
	public void moveCursor(int amount) {
		document.moveCursor(amount);
	}
	
	public void undo() {
		document.setMemento(history.pop());
	}
	
	public void show() {
		document.printState();
	}
}