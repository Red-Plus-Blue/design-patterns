package com.red.plus.blue.design_patterns.observer.concept;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
	
	protected List<Observer<T>> observers = new ArrayList<>();
	protected T value;
	
	public Subject(T initialValue) {
		value = initialValue;
	}
	
	public void attach(Observer<T> observer) {
		observers.add(observer);
		observer.onChange(value);
	}
	
	public void set(T value) {
		this.value = value;
		observers.forEach(observer -> observer.onChange(value));
	}
	
	public T get() {
		return value;
	}

}
