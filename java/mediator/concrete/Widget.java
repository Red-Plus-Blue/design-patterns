package com.red.plus.blue.design_patterns.mediator.concrete;

public abstract class Widget {
	
	protected Form parent;
	protected boolean enabled = true;
	
	protected Widget(Form parent) {
		this.parent = parent;
	}
	
	public void disable() {
		this.enabled = false;
	}
	
	public void enable() {
		this.enabled = true;
	}
	
	public abstract String getText();
	
	public abstract void display();
}
