package com.red.plus.blue.design_patterns.observer.concept;

public class Demo {

	public static void main(String[] args) {
		
		var subject = new Subject<String>("Initial");
		var observer1 = new Observer<String>(message -> System.out.println("Observer1: " + message));
		var observer2 = new Observer<String>(message -> System.out.println("Observer2: " + message));
		
		subject.attach(observer1);
		subject.attach(observer2);

		subject.set("Hello, world");
	}
	
}
