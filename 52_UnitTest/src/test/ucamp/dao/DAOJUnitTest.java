package test.ucamp.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ucamp.dao.MemberDAO;


public class DAOJUnitTest {

	static MemberDAO m;
	@BeforeClass
	public static void �׽�Ʈ_����() {
		System.out.println("�׽�Ʈ ����");
		m=new MemberDAO();
	}
	
	@Before
	public void �����׽�Ʈ_����() {
		System.out.println("�����׽�Ʈ ����");
	}

	@Test
	public void �����׽�Ʈ() {
		System.out.println("���ڿ��� Ȯ��");
	}
	@Test
	public void ���ں�() {
		int num1=10, num2=10;
		assertTrue(num1 == num2);
	}
	@Test
	public void �α���_��() {
		m.login(null, "1234");
	}
	@Test
	public void �α���_üũ() {
		assertNotNull(m.login("admin", "1234"));
	}
	
}
