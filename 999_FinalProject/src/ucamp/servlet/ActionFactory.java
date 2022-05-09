package ucamp.servlet;

public class ActionFactory {
	private ActionFactory() {}
	//업무가 늘어나면 Action페이지와 연결 페이지 증가
	public static Action getAction(String cmd) {
		Action a=null;
	
//		switch(cmd) {
//			case "main":
//				a = new MainAction();
//				break;
//			default : a = new MainAction();
//		}
		
		return a;
	}
	
}
