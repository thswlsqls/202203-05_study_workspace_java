package ucamp.servlet;

public class ActionFactory {
	private ActionFactory() {}
	//������ �þ�� Action�������� ���� ������ ����
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
