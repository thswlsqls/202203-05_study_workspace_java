package com.ucamp.servlet;

public class ActionFactory {
	//생성자는 항상 제공, 사용 못게 막기 위해서는 private
	private ActionFactory() {}

	public static Action getAction(String cmd) {
		Action a=null;
		
		switch(cmd) {
		case "loginUI":
			break;
		
		default :
			a=new MainAction();  //없거나 모르는 cmd값인 경우			
		
		}	
		
		return a;
	}

}
