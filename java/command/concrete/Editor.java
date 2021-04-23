package com.red.plus.blue.design_patterns.command.concrete;

public class Editor {

	protected String content = "";
	protected String clipboard = "";
	
	public void printState() {
		System.out.println("==== Current Editor State ====");
		System.out.println("Content:   " + content);
		System.out.println("Clipboard: " + clipboard);
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}
	
}
