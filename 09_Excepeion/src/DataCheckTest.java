/** �̸��� 2~4�ڱ���,  �⺻ ����Ʈ�� 10����Ʈ �̻� �� ������ ���� 
 * ����, �̸� �ܼҸ� ����(NameLengthException, PointValueException) ==> �ϰ��� �ڵ� ex)java.sql.* 
 * ���� - �������*/

// �̼� - PointValueException 
class Customer{
	private String name;
	private int point;
	
	public Customer(String name) throws NameLengthException, PointValueException {
		this(name, 10); 
	}
	
	public Customer(String name, int point) throws NameLengthException, PointValueException {
		super();
		setName(name);
		setPoint(point);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", point=" + point + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameLengthException {
		if(name == null || name.length()<2 || name.length()>4)
			throw new NameLengthException("�̸� 2~4");
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) throws PointValueException {
		if(point < 10)
			throw new PointValueException("�⺻ ����Ʈ�� 10����Ʈ �̻�");
		this.point = point;
	}
	
}

public class DataCheckTest {
	public static void main(String[] args) {
//		Customer c1=new Customer("ȫ�浿", -10);
		Customer c1=null;
		try {
			c1 = new Customer("ȫ�浿", -10);
		} catch (NameLengthException | PointValueException e) {
			e.printStackTrace();
		}
		System.out.println(c1);
	}
}


/***
 	�̸��� 2~4�ڱ���, �⺻ ����Ʈ�� 10����Ʈ �̻� �� ������ ����
 * ����, �̸� �ܼҸ� ����(NameLengthException, PointValueException) ==>�ϰ��� �ڵ�   ex)java.sql.*
 * ����-�������
class Customer{
	private String name;
	private int point;
	public Customer(String name) throws NameLengthException {
		this(name, 10);
	}	
	public Customer(String name, int point) throws NameLengthException {
		super();
		setName(name);
		setPoint(point);
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", point=" + point + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameLengthException {
		if(name ==null || name.length()<2 || name.length()>4 )
			throw new NameLengthException("�̸� 2~4");
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
public class DataCheckTest {
	public static void main(String[] args) {
		//Customer c1=new Customer("ȫ�浿", -10);
		Customer c1=null;
		try {
			c1 = new Customer("ȫ");
		} catch (NameLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1);
	}
}
*/


