package com.red.plus.blue.design_patterns.mediator.concrete.peers;

import com.red.plus.blue.design_patterns.mediator.concrete.Form;
import com.red.plus.blue.design_patterns.mediator.concrete.Widget;

public class Button extends Widget {
	
	protected String label;

	protected Button(Form parent) {
		super(parent);
	}
	
	public Button(Form parent, String label) {
		this(parent);
		this.label = label;
	}
	
	public void click() {
		parent.onClick(this);
	}

	@Override
	public void display() {
		System.out.println(String.format("[%s]", label));
	}

	@Override
	public String getText() {
		return null;
	}
	
}
