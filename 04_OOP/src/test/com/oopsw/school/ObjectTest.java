package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;

public class ObjectTest {

	public static void main(String[] args) {
		int num = 100;
		String s = "hi";
		Person p1 = new Student("200101001", "홍길동");
		
		System.out.println(num);
		System.out.println(s);
		System.out.println(p1.toString()); // println의 인자로 Person타입을 받는 오버로딩 메서드는 없지만, Object를 상속했기 때문에 가능함
		// 그리고 이상의 코드에는 toString()이라는 코드가 숨어있음
	}

}

/**
 * 
 * 
 * 
package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;

public class ObjectTest {
	public static void main(String[] args) {
		int num=100;
		String s="hi";
		Person p1=new Student("200101001", "홍길동");
		
		System.out.println(num);
		System.out.println(s);
		System.out.println(p1.toString());
		
	}
}

 */