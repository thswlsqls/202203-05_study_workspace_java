package test.ucamp.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ucamp.dao.MemberDAO;


public class DAOJUnitTest {

	static MemberDAO m;
	@BeforeClass
	public static void 테스트_시작() {
		System.out.println("테스트 시작");
		m=new MemberDAO();
	}
	
	@Before
	public void 단위테스트_시작() {
		System.out.println("단위테스트 시작");
	}

	@Test
	public void 업무테스트() {
		System.out.println("문자열로 확인");
	}
	@Test
	public void 숫자비교() {
		int num1=10, num2=10;
		assertTrue(num1 == num2);
	}
	@Test
	public void 로그인_널() {
		m.login(null, "1234");
	}
	@Test
	public void 로그인_체크() {
		assertNotNull(m.login("admin", "1234"));
	}
	
}
