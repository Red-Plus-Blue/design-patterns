package com.red.plus.blue.design_patterns.mediator.concept;

public abstract class Peer {

	protected Mediator mediator;
	
	protected Peer(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void run();
	
	public void notify(String message) {
		System.out.println(String.format("[%s] Notified: %s", this, message));
	}
	
}
