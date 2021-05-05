package com.red.plus.blue.design_patterns.observer.concept;

import java.util.function.Consumer;

public class Observer<T> {

	protected Consumer<T> onChange;
	
	public Observer(Consumer<T> onChange) {
		this.onChange = onChange;
	}
	
	public void onChange(T value) {
		onChange.accept(value);
	}

}
