package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {

	public static void main(String[] args) {
		// ��?
		// �䱸������ ������� ���� ��Ȳ üũ��
		// �μ�(����)�� �Է¹޾Ƽ� XXXXXX
		int num1, num2;
		
		// �μ� (10, 10.5)
		float f1 = 10; 
		double d1 = 10.5;
		
		// �л��� XXX�ϸ� �л��� ������ Ȯ����
		Student s1 = new Student("200101001", "ȫ�浿");
		
		// �л� �ý����� XXX�� ���� �л� �Ǵ� ���� ... �� ������ Ȯ���� �� ����
		Person p1 = new Student("200101002", "�̼���");
		p1 = new Teacher("t001", "�������");
		
		// int num3 = 10.5; // �Ǽ��� �������� ũ�� ������ �ȵȴ�.
		// Student s2 = new Person(); // �θ� Person�� �ڽĺ��� ũ�� ������ �ȵȵ�.
		// Student s3 = new Teacher("t001", "������"); // �л��� ����� ��Ӱ��谡 ����.
	}

}

/**
 * 

package test.com.oopsw.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest {
	public static void main(String[] args) {
		//��???
		//�䱸������ ������� ���� ��Ȳ üũ
		//�μ�(����)�� �Է¹޾Ƽ� XXXXXX
		int num1=10, num2=20;
		
		//�μ� (10, 10.5)
		float f1 =10;
		double d1 =10.5;
		
		//�л��� XXX �ϸ� �л��� ������ Ȯ��
		Student s1=new Student("200101001", "ȫ�浿");
		
		//�л� �ý����� XXX�� ���� �л� �Ǵ� ���� ....�� ������ Ȯ��
		Person p1=new Student("200101002", "�̼���");
		p1=new Teacher("t001", "�������");
		
		//�ȵǴ� ������ ��Ȯ�ϸ� �Ǵ� ������ �� Ȱ��
		//int num3 = 10.5;   //�Ǽ��� �������� ũ�⶧���� �ȵȴ�.
		//Student s2=new Person();  //�θ� Person�� �ڽĺ��� ũ�⶧���� �ȵȴ�.
		//Student s3=new Teacher("t001", "������");  //�л��� ����� ��Ӱ��谡 ����.
		
	}
}

 *
 */
