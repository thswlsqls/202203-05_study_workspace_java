package ucamp.servlet;

public class ActionFactory {
	private ActionFactory() {}
	//업무가 늘어나면 Action페이지와 연결 페이지 증가
	public static Action getAction(String cmd) {
		Action a=null;
	
		switch(cmd) {
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
			case "visitorListUI":
				a = new VisitorListUIAction();
				break;
			case "visitorUI":
				a = new VisitorUIAction();
				break;
			case "addVisitorUI":
				a = new AddVisitorUIAction();
				break;
			case "addVisitor":
				a = new AddVisitorAction();
				break;
			case "updateVisitorUI":
				a = new UpdateVisitorUI();
				break;
			case "updateVisitor":
				a = new UpdateVisitorAction();
				break;
			case "deleteVisitor":
				a = new DeleteVisitorAction();
				break;
			default : a = new MainAction();
		}
		
		return a;
	}
	
}
