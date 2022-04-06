import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JCBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. driver는 각각 DBMS회사에서 구현 - 기본 제공 x, 수동으로 제공
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		
		// 2. DB연결 서버의 정보 및 계정
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";	
		Connection conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS 연결 OK");
		
		// 3. 4세트 ==> 업무에 따라 조회, 입력, 추가, 삭제, 수정
		String departmentName = "IT";
		String sql = 
				"SELECT\r\n" + 
				"  e.employee_id\r\n" + 
				"  , e.first_name || e.last_name\r\n" + 
				"  , e.salary\r\n" + 
				"  , d.department_name\r\n" + 
				"FROM employees e, departments d\r\n" + 
				"WHERE e.department_id = d.department_id\r\n" + 
				"AND department_name = '"+ departmentName + "'\r\n";
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		String sql2 = 
				"SELECT\r\n" + 
				"  e.employee_id\r\n" + 
				"  , e.first_name || e.last_name\r\n" + 
				"  , e.salary\r\n" + 
				"  , d.department_name\r\n" + 
				"FROM employees e, departments d\r\n" + 
				"WHERE e.department_id = d.department_id\r\n" + 
				"AND department_name = ?\r\n";
		PreparedStatement pstmt=conn.prepareStatement(sql2);
		pstmt.setString(1, departmentName);
		ResultSet rs2=pstmt.executeQuery();
		
		// 4. 결과 확인하기
//		while(rs.next()) {
////			System.out.println("end");
//			System.out.println(rs.getInt(1) 
//							   + " " + rs.getString(2) 
//							   + " " + rs.getString(3)
//							   + " " + rs.getString(4)); 
//		}
		while(rs2.next()) {
//			System.out.println("end");
			System.out.println(rs2.getInt(1) 
							   + " " + rs2.getString(2) 
							   + " " + rs2.getString(3)
							   + " " + rs2.getString(4)); 
		}
		
		//5. 서버는 공유 - 다쓰면 반환
		rs.close(); stmt.close(); // 장바구니 - 일정 갯수만큼
		rs2.close(); pstmt.close();
		
		conn.close(); // 문 - 일정 갯수만큼
		System.out.println("end");
	}

}
