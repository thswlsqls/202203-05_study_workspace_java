// 데이터를 순서대로 저장하고 싶다 - 순서
//데이터의 중복 체크 저장
// User계열(CustomerUser, EmployeeUser ... )객체를 순서대로 저장하고 싶다. -> 제네릭 프로그래밍 5.0

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		Collection c; // 제네릭 프로그래밍
//		Collection<User> c; // 제네릭 프로그래밍
		c = new ArrayList();
//		c = new HashSet();	//메모리 종류만 바꿈으로서 변경된 요구사항을 반영함.
		
//		System.out.println(c.add(1234));	// 오브젝트는 객체여야만 함, 1234는 버추어 머신이 Integer객체로 바꿈
//		System.out.println(c.add("hi")); 	// "" --> String
		System.out.println(c.add(new User("홍길동")));
//		System.out.println(c.add(1234));	// 오브젝트는 객체여야만 함, 1234는 버추어 머신이 Integer객체로 바꿈
//		System.out.println(c.add("hi")); 	// "" --> String
		System.out.println(c.add(new User("홍길동")));
		
		System.out.println(c);	// 메모리의 값을 확인 toString();
	}	
}

////데이터를 순서대로 저장하고 싶다 - 순서
//import java.util.*; 
//public class ListTest {
//public static void main(String[] args) {
//	Collection c;
//	c=new ArrayList();
//	
//	System.out.println(c.add(1234));     //1234 -->Integer
//	System.out.println(c.add("hi"));     //""  -->String
//	System.out.println(c.add(new User("홍길동")));
//	System.out.println(c.add(1234));     //1234 -->Integer
//	System.out.println(c.add("hi"));     //""  -->String
//	System.out.println(c.add(new User("홍길동")));
//	
//	System.out.println(c);  //메모리의 값을 확인 toString()
//}
//}


