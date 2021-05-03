package com.red.plus.blue.design_patterns.mediator.concept;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	protected PeerOne peerOne;
	protected List<PeerTwo> peers = new ArrayList<>();
	
	public Mediator() {
		peerOne = new PeerOne(this);
		peers.add(new PeerTwo(this));
		peers.add(new PeerTwo(this));
		
		peerOne.run();
	}
	
	public void send(String message) {
		peers.forEach(peer -> peer.notify(message));
	}
	
}
