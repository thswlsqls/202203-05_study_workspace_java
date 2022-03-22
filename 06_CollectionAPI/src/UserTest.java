//User계열 (CustomerUser, EmployeeUser...)객체를 순서대로 저장하고 싶다.  5.0
import java.util.*; 
public class UserTest {
	public static void main(String[] args) {
		Collection<User> c;
		//c=new ArrayList();
		c=new HashSet();//처리 종류만 변경
		
//		System.out.println(c.add(1234));     //1234 -->Integer
//		System.out.println(c.add("hi"));     //""  -->String
		System.out.println(c.add(new User("홍길동")));
//		System.out.println(c.add(1234));     //1234 -->Integer
//		System.out.println(c.add("hi"));     //""  -->String
		System.out.println(c.add(new User("홍길동")));
		
		System.out.println(c);  //메모리의 값을 확인 toString()
	}
}
