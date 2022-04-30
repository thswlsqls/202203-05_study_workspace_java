package ucamp.servlet;

public class AjaxActionFactory {

	AjaxActionFactory(){};
	public static AjaxAction getAjaxAction(String cmd) {
		AjaxAction aa = null;
		
		switch(cmd) {
			case "checkDuplicateId": 
				aa = new CheckDuplicateIdAction();
				break;
			case "getVisitorListById": 
				aa = new GetVisitorListByIdAction();
				break;
			default: 
				break;
		}
		
		return aa;
		
	}	
}

