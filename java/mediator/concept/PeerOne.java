package com.red.plus.blue.design_patterns.mediator.concept;

public class PeerOne extends Peer {

	protected PeerOne(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void run() {
		mediator.send("Hello, world");
	}

}
