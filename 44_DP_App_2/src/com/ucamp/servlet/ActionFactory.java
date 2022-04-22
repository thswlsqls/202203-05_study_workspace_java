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
		case "signupUI":
			a=new SignupUIAction();
			break;
		case "signup":
			a=new SignupAction();
			break;
		case "login":
			a=new LoginAction();
			break;
		default :
			a=new MainAction();  //���ų� �𸣴� cmd���� ���			
		
		}	
		
		return a;
	}

}
