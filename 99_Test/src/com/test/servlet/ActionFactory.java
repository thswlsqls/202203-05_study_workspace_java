package com.test.servlet;

public class ActionFactory {
	
	private ActionFactory() {}
	
	public static Action getAction(String cmd) {
		
		Action a = null;
		
		if(cmd == null) {
			a = new MainAction();
		}
		
		switch(cmd) {
			case "loginUI":
				a= new LoginUIAction();
				break;
			case "signupUI":
				a = new SignupUIAction();
				break;
			case "signup":
				a = new SignupAction();
				break;
			case "login":
				a = new LoginAction();
				break;
			default :a = new MainAction();
		}
			
		return a;
	}

}
