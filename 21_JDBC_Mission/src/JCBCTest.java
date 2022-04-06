import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JCBCTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. driver�� ���� DBMSȸ�翡�� ���� - �⺻ ���� x, �������� ����
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		System.out.println("1.driver loading OK");
		
		// 2. DB���� ������ ���� �� ����
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "hr";
		String pw = "hr";	
		Connection conn=DriverManager.getConnection(url, id, pw);
		System.out.println("2.DBMS ���� OK");
		
		// 3. 4��Ʈ ==> ������ ���� ��ȸ, �Է�, �߰�, ����, ����
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
		
		// 4. ��� Ȯ���ϱ�
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
		
		//5. ������ ���� - �پ��� ��ȯ
		rs.close(); stmt.close(); // ��ٱ��� - ���� ������ŭ
		rs2.close(); pstmt.close();
		
		conn.close(); // �� - ���� ������ŭ
		System.out.println("end");
	}

}
