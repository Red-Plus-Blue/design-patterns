package com.red.plus.blue.design_patterns.null_object.concept;

public abstract class AbstractObject {
	
	public static AbstractObject empty() { return new NullObject(); }
	
	protected static final class NullObject extends AbstractObject {

		@Override
		public void doSomething() {
			System.out.println("Calling null object, doing nothing...");
		}
		
	}

	public abstract void doSomething();
	
}
