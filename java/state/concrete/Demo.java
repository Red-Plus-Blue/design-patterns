package com.red.plus.blue.design_patterns.state.concrete;

public class Demo {
	
	public static void main(String[] args) {
		var document = new Document();
		document.edit();
		document.publish();
		document.edit();
		document.publish();
		document.edit();
		document.publish();
	}

}
