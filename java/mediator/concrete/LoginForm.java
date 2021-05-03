package com.red.plus.blue.design_patterns.mediator.concrete;

import com.red.plus.blue.design_patterns.mediator.concrete.peers.Button;
import com.red.plus.blue.design_patterns.mediator.concrete.peers.Input;
import com.red.plus.blue.design_patterns.mediator.concrete.peers.Label;

public class LoginForm extends Form {
	
	protected Widget username;
	protected Widget password;
	protected Widget error;
	protected Widget submit;
	
	public LoginForm() {
		this.username = new Input(this, "Username");
		this.password = new Input(this, "Password");
		this.error = new Label(this, "Invalid username or password");
		this.error.disable();
		this.submit = new Button(this, "Submit");
	}
	
	@Override
	public void onClick(Widget from) {
		var usernameIsValid = "admin123".equals(username.getText());
		var passwordIsValid = "password123".equals(password.getText());

		if(!usernameIsValid || !passwordIsValid) {
			error.enable();
			System.out.println(">> Login Failed");
			return;
		}
		
		System.out.println(">> Login Successful");
	}

	@Override
	public void display() {
		System.out.println("===========================");
		username.display();
		password.display();
		error.display();
		submit.display();
	}

}
