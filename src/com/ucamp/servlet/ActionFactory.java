package com.ucamp.servlet;

public class ActionFactory {
	//�����ڴ� �׻� ����, ��� ���� ���� ���ؼ��� private
	private ActionFactory() {}

	public static Action getAction(String cmd) {
		Action a=null;
		
		switch(cmd) {
		case "loginUI":
			break;
		
		default :
			a=new MainAction();  //���ų� �𸣴� cmd���� ���			
		
		}	
		
		return a;
	}

}
