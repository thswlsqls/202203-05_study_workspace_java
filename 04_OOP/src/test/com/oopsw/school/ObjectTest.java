package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;

public class ObjectTest {

	public static void main(String[] args) {
		int num = 100;
		String s = "hi";
		Person p1 = new Student("200101001", "ȫ�浿");
		
		System.out.println(num);
		System.out.println(s);
		System.out.println(p1.toString()); // println�� ���ڷ� PersonŸ���� �޴� �����ε� �޼���� ������, Object�� ����߱� ������ ������
		// �׸��� �̻��� �ڵ忡�� toString()�̶�� �ڵ尡 ��������
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
		Person p1=new Student("200101001", "ȫ�浿");
		
		System.out.println(num);
		System.out.println(s);
		System.out.println(p1.toString());
		
	}
}

 */