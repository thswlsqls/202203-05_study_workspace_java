package com.test.servlet;

public class ActionFactory {
	
	private ActionFactory() {}
	
	public static Action getAction(String cmd) {
		
		Action a = null;
		
		switch (cmd) {
			case "main":
				a = new MainAction();
				break;
			case "addUserUI":
				a = new AddUserUIAction();
				break;
			case "addUser":
				a = new AddUserAction();
				break;
			case "loginUI":
				a = new LoginUIAction();
				break;
			case "login":
				a = new LoginAction();
				break;
			case "logout":
				a = new LogoutAction();
				break;
			case "addWriteUI":
				a = new AddWriteUIAction();
				break;
			case "addWrite":
				a = new AddWriteAction();
				break;
			case "userWriterList":
				a = new UserWriterListAction();
				break;
			case "userWriterUI":
				a = new UserWriterUIAction();
				break;
			case "updateWriterUI":
				a = new UpdateWriterUIACtion();
				break;
			case "updateWriter":
				a = new UpdateWriterACtion();
				break;
			case "deleteWriter":
				a = new DeleteWriterAction();
				break;
	
			default: a = new MainAction();
				break;
		}	
		return a;
	}
}
