package com.ucamp.servlet;

public class ActionFactory {
	//�����ڴ� �׻� ����, ��� ���� ���� ���ؼ��� private
	private ActionFactory() {}

	public static Action getAction(String cmd) {
		Action a=null;
		
		switch(cmd) {
		case "loginUI":
			a=new LoginUIAction();
			break;
		case "loginAction":
			a=new LoginAction();
			break;
		case "addUserUI":
			a=new AddUserUIAction();
			break;
		case "addUserAction":
			a=new AddUserAction();
			break;
		case "logoutAction":
			a=new LogoutAction();
			break;
		case "addWriterUI":
			a=new AddWriterUIAction();
			break;
		case "addWriterAction":
			a=new AddWriterAction();
			break;
		default :
			a=new MainAction();  //���ų� �𸣴� cmd���� ���			
		
		}	
		
		return a;
	}

}
