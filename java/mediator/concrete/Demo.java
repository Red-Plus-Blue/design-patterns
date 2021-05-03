package com.red.plus.blue.design_patterns.mediator.concrete;

import com.red.plus.blue.design_patterns.mediator.concrete.peers.Button;
import com.red.plus.blue.design_patterns.mediator.concrete.peers.Input;

public class Demo {
	
	public static void main(String[] args) {
		
		var form = new LoginForm();
		((Input)form.username).input("admin");
		((Input)form.password).input("admin");
		form.display();
		
		((Button)form.submit).click();
		form.display();
		
		((Input)form.username).input("admin123");
		((Input)form.password).input("password123");
		form.display();
		
		((Button)form.submit).click();
	}

}
