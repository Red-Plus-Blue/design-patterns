package com.red.plus.blue.design_patterns.iterator.concept;

import java.util.function.Consumer;

public abstract class Iterator<T> {
	
	protected Collection<T> target;
	
	protected Iterator(Collection<T> target) {
		this.target = target;
	}

	public abstract T next();
	
	public abstract boolean hasNext();
	
	public void forEach(Consumer<T> action) {
		while(hasNext()) {
			action.accept(next());
		}
	}
}
