//�����͸� �ߺ� üũ ����(����)
import java.util.*; 
public class SetTest {
	public static void main(String[] args) {
		Collection c;
//		c=new ArrayList();
		c=new HashSet();//ó�� ������ ����
		
		System.out.println(c.add(1234));     //1234 -->Integer
		System.out.println(c.add("hi"));     //""  -->String
		System.out.println(c.add(new User("ȫ�浿")));
		System.out.println(c.add(1234));     //1234 -->Integer
		System.out.println(c.add("hi"));     //""  -->String
		System.out.println(c.add(new User("ȫ�浿")));
		
		System.out.println(c);  //�޸��� ���� Ȯ�� toString()
	}
}

