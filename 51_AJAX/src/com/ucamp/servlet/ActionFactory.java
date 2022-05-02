package com.ucamp.servlet;

public class ActionFactory {
	
	private ActionFactory() {}

	public static Action getAction(String cmd) {
		Action a = null;
		
		switch(cmd) {
		
		case "addUserUI":
		case "addWriterUI":
		case "loginUI" : a = new UIAction();
		break;
		case "loginAction" : a = new LoginAction();
		break;
		case "logoutAction" : a = new LogoutAction();
		break;
		case "addUserAction" : a = new AddUserAction();
		break;
		case  "addWriterAction" : a = new AddWriterAction();
		break;
		case "updateContentAction" : a = new UpdateContentAction();
		break;
		case "removeWriterAction" : a = new RemoveContentAction();
		break;
		case "checkIdAction" : a = new CheckIdAction();
		break;
		case "searchWriterAction" : a = new SearchWriterAction();
		break;
		
		default : a = new MainAction();
		
		}
		
		return a;
		
	}
}
