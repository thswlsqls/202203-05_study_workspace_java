// �����͸� ������� �����ϰ� �ʹ� - ����
//�������� �ߺ� üũ ����
// User�迭(CustomerUser, EmployeeUser ... )��ü�� ������� �����ϰ� �ʹ�. -> ���׸� ���α׷��� 5.0

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		Collection c; // ���׸� ���α׷���
//		Collection<User> c; // ���׸� ���α׷���
		c = new ArrayList();
//		c = new HashSet();	//�޸� ������ �ٲ����μ� ����� �䱸������ �ݿ���.
		
//		System.out.println(c.add(1234));	// ������Ʈ�� ��ü���߸� ��, 1234�� ���߾� �ӽ��� Integer��ü�� �ٲ�
//		System.out.println(c.add("hi")); 	// "" --> String
		System.out.println(c.add(new User("ȫ�浿")));
//		System.out.println(c.add(1234));	// ������Ʈ�� ��ü���߸� ��, 1234�� ���߾� �ӽ��� Integer��ü�� �ٲ�
//		System.out.println(c.add("hi")); 	// "" --> String
		System.out.println(c.add(new User("ȫ�浿")));
		
		System.out.println(c);	// �޸��� ���� Ȯ�� toString();
	}	
}

////�����͸� ������� �����ϰ� �ʹ� - ����
//import java.util.*; 
//public class ListTest {
//public static void main(String[] args) {
//	Collection c;
//	c=new ArrayList();
//	
//	System.out.println(c.add(1234));     //1234 -->Integer
//	System.out.println(c.add("hi"));     //""  -->String
//	System.out.println(c.add(new User("ȫ�浿")));
//	System.out.println(c.add(1234));     //1234 -->Integer
//	System.out.println(c.add("hi"));     //""  -->String
//	System.out.println(c.add(new User("ȫ�浿")));
//	
//	System.out.println(c);  //�޸��� ���� Ȯ�� toString()
//}
//}


