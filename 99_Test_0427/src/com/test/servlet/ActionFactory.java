package com.test.servlet;

public class ActionFactory {
	
	private ActionFactory() {}
	
	public static Action getAction(String cmd) {
		
		Action a = null;
		
		switch(cmd) {
			case "signupUI":
				a = new SignupUIAction();
				break;
			case "loginUI":
				a = new LoginUIAction();
				break;
			case "addUser":
				a = new AddUserAction();
				break;
			case "login":
				a = new LoginAction();
				break;
			case "logout":
				a = new LogoutAction();
				break;
			case "addUserWriterUI":
				a = new AddUserWriterUIAction();
				break;
			case "addUserWriter":
				a = new AddUserWriterAction();
				break;
			default: a = new MainAction();
		}
		
		return a;
	}

}
