package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

// ����� ���ư����� Ȯ�� - �����(VM)�� �ǹ��� ���� �� ���� - ���� ��Ȳ�� Ȯ���� �ʿ� ���� - �ٰ�(���)�� ã�ƾ� �� - API
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("ȫ�浿");
		Student s1 = new Student("200101001", "�̼���");
		Teacher t1 = new Teacher("t001", "�������");
		
		p.print();
		s1.print();
		t1.print();
	}
}


/**
 * 

package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;
//����� ���ư����� Ȯ�� - �����(VM) - ���� ��Ȳ�� Ȯ�� - �ٰ�(���) = API(��������)
public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person("ȫ�浿");
		Student s1=new Student("200101001", "�̼���");
		Teacher t1=new Teacher("t001", "�������");
		p.print();
		s1.print();
		t1.print();
	}
}

 * 
 */
