package com.red.plus.blue.design_patterns.memento.concrete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Document {
	
	protected List<String> lines = new ArrayList<>();
	protected int cursorPosition;
	protected String clipboard;
	
	public static class Snapshot {
		protected final List<String> lines;
		protected final int cursorPosition;
		
		protected Snapshot(List<String> lines, int cursorPosition) {
			this.lines =  Arrays.asList(lines.toArray(new String[0]));
			this.cursorPosition = cursorPosition;
		}
	}
	
	public Snapshot getMemento() {
		return new Snapshot(lines, cursorPosition);
	}
	
	public void setMemento(Snapshot snapshot) {
		lines = Arrays.asList(snapshot.lines.toArray(new String[0]));
		cursorPosition = snapshot.cursorPosition;
	}
	
	public void addLine(String line) {
		lines.add(cursorPosition, line);
		cursorPosition++;
	}
	
	public void cut() {
		clipboard = lines.get(cursorPosition);
		lines.remove(cursorPosition);
		cursorPosition = cursorPosition > lines.size() ? lines.size() - 1 : cursorPosition; 
	}
	
	public void paste() {
		lines.add(cursorPosition, clipboard);
	}
	
	public void moveCursor(int amount) {
		cursorPosition += amount;
	}
	
	public void printState() {
		System.out.println("========================================");
		IntStream
			.range(0, lines.size())
			.mapToObj(index -> String.format("%s %-3d %s", index == cursorPosition ? "> " : "  " , index, lines.get(index)))
			.forEach(System.out::println);
	}

}
