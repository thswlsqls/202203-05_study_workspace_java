package com.ucamp.servlet;

public class ActionFactory {
	
	public ActionFactory() {}
	
	public static Action getAction(String cmd) {
		
		Action a = null;
		
		switch (cmd) {
		case "logoutUI":
			a = new logoutUIAction();
			break;
			
		case "loginAction":
			a = new loginAction();
			break;
			
		case "signupUI":
			a = new signupUIAction();
			break;
						
		case "signupAction":
			a = new signupAction();
			break;
			
		case "enrollmentsUI":
			a = new enrollmentUIAction();
			break;
			
		case "lecturesUI":
			a = new lecturesUIAction();
			break;
			
		case "registerLectureUI":
			a = new registerLectureUIAction();
			break;
			
		case "registerLectureAction":
			a = new registerLectureAction();
			break;
			
		case "enrollmentAction":
			a = new enrollmentAction();
			break;
			
		case "professorsignupUI":
			a = new professorsignupUIAction();
			break;
			
		case "professorsignupAction":
			a = new professorsignupAction();
			break;
				
		default:
			a = new logoutUIAction();
			break;
		}
		
		return a;
	}

}
