package ucamp.dao;

public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("������ = ���� �ڵ�");
	}
	
	/**������ ������ YES, NO - "" or null , Exception - Tomcat�� ����ó���� ������ �ϱ� ������ ������ ����X */
	public String login(String id, String pw) {
		if(id==null || pw==null) {
			throw new NullPointerException();
		}
		String name=null;
		
		// jdbc
		if(name.equals("admin") && pw.equals("1234"))
			name="������";
		
		return name;
	}
}
