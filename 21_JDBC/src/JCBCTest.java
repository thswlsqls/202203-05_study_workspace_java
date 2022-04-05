import java.sql.Connection;
import java.sql.DriverManager;
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
//		String sql = "SELECT"
//				+ "employee_id"
//				+ ", first_name || last_name"
//				+ ", salary"
//				+ " FROM employees";
		String sql = "SELECT employee_id, first_name || last_name, salary "
				+ "FROM employees";

		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		// 4. 
		while(rs.next()) {
			System.out.println("end");
			System.out.println(rs.getInt(1) 
							   + " " + rs.getString(2) 
							   + " " + rs.getFloat("salary")); 
		}
		
		//5. ������ ���� - �پ��� ��ȯ
		rs.close(); stmt.close(); // ��ٱ��� - ���� ������ŭ
		conn.close(); // �� - ���� ������ŭ
		
		System.out.println("end");
	}

}
