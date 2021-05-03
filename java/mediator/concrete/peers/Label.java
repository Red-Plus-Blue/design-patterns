package com.red.plus.blue.design_patterns.mediator.concrete.peers;

import com.red.plus.blue.design_patterns.mediator.concrete.Form;
import com.red.plus.blue.design_patterns.mediator.concrete.Widget;

public class Label extends Widget {

	protected String text;
	
	protected Label(Form parent) {
		super(parent);
	}
	
	public Label(Form parent, String text) {
		this(parent);
		this.text = text;
	}

	@Override
	public void display() {
		if(!enabled) {
			return;
		}
		System.out.println(text);
	}
	
	@Override
	public String getText() {
		return null;
	}

}
