package ucamp.dao;

public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("생성자 = 공통 코드");
	}
	
	/**리턴은 업무의 YES, NO - "" or null , Exception - Tomcat은 예외처리를 서버가 하기 때문에 비전상 종료X */
	public String login(String id, String pw) {
		if(id==null || pw==null) {
			throw new NullPointerException();
		}
		String name=null;
		
		// jdbc
		if(name.equals("admin") && pw.equals("1234"))
			name="관리자";
		
		return name;
	}
}
