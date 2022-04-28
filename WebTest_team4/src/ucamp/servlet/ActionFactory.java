package ucamp.servlet;

public class ActionFactory {
	private ActionFactory() {}
	//업무가 늘어나면 Action페이지와 연결 페이지 증가
	public static Action getAction(String cmd) {
		Action a=null;
		
		switch (cmd) {
		case "loginAction":
			a = new LoginAction();
			break;
		case "logoutAction":
			a = new LogoutAction();
			break;
		case "signupUI":
			a = new SignupUIAction();
			break;
		case "signupAction":
			a = new SignupAction();
			break;
		case "userpageUI":
			a = new UserPageUIAction();
			break;
		case "visitorwritelistUI":
			a = new VisitorWriteListUI();
			break;
		case "visitorwriteUI":
			a = new VisitorWriteUIAction();
			break;
		case "visitorwriteAction":
			a = new VisitorWriteAction();
			break;
		case "updatewriteAction":
			a = new UpdateWriteAction();
			break;
		case "deletewriteAction":
			a = new DeleteWriteAction();
			break;
		default:
			a = new MainAction();
		}
		
		return a;
	}
	
}
