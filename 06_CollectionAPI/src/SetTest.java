//데이터를 중복 체크 저장(업무)
import java.util.*; 
public class SetTest {
	public static void main(String[] args) {
		Collection c;
//		c=new ArrayList();
		c=new HashSet();//처리 종류만 변경
		
		System.out.println(c.add(1234));     //1234 -->Integer
		System.out.println(c.add("hi"));     //""  -->String
		System.out.println(c.add(new User("홍길동")));
		System.out.println(c.add(1234));     //1234 -->Integer
		System.out.println(c.add("hi"));     //""  -->String
		System.out.println(c.add(new User("홍길동")));
		
		System.out.println(c);  //메모리의 값을 확인 toString()
	}
}

