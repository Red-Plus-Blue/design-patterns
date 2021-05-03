package com.red.plus.blue.design_patterns.mediator.concrete.peers;

import com.red.plus.blue.design_patterns.mediator.concrete.Form;
import com.red.plus.blue.design_patterns.mediator.concrete.Widget;

public class Input extends Widget {

	protected String text = "";
	protected String label;
	
	protected Input(Form parent) {
		super(parent);
	}
	
	public Input(Form parent, String label) {
		this(parent);
		this.label = label;
	}
	
	public void input(String value) {
		this.text = value;
	}

	@Override
	public void display() {
		System.out.println(String.format("%-10s |%-20s|", label + ":", text));
	}

	@Override
	public String getText() {
		return text;
	}
	
}
