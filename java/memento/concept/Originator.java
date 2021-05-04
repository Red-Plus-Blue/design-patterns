package com.red.plus.blue.design_patterns.memento.concept;

public class Originator {
	
	protected String string = "default";
	protected int printedCount;
	
	public void setString(String string) {
		this.string = string;
		printedCount = 0;
	}
	
	public Memento createMemento() {
		return new Memento(string, printedCount);
	}
	
	public void setMemento(Memento memento) {
		string = memento.string;
		printedCount = memento.printedCount;
	}
	
	public void printString() {
		printedCount++;
		System.out.println(String.format("[%d] %s", printedCount, string));
	}
	
	public static class Memento {
		
		protected final String string;
		protected final int printedCount;
		
		public Memento(String string, int printedCount) {
			this.string = string;
			this.printedCount = printedCount;
		}
	}
	
}
