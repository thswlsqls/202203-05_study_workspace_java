/** 이름은 2~4자까지,  기본 포인트는 10포인트 이상 고객 정보를 관리 
 * 구조, 미리 잔소리 결정(NameLengthException, PointValueException) ==> 일관성 코딩 ex)java.sql.* 
 * 구현 - 제약사항*/

// 미션 - PointValueException 
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
			throw new NameLengthException("이름 2~4");
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) throws PointValueException {
		if(point < 10)
			throw new PointValueException("기본 포인트는 10포인트 이상");
		this.point = point;
	}
	
}

public class DataCheckTest {
	public static void main(String[] args) {
//		Customer c1=new Customer("홍길동", -10);
		Customer c1=null;
		try {
			c1 = new Customer("홍길동", -10);
		} catch (NameLengthException | PointValueException e) {
			e.printStackTrace();
		}
		System.out.println(c1);
	}
}


/***
 	이름은 2~4자까지, 기본 포이트는 10포인트 이상 고객 정보를 관리
 * 구조, 미리 잔소리 결정(NameLengthException, PointValueException) ==>일관성 코딩   ex)java.sql.*
 * 구현-제약사항
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
			throw new NameLengthException("이름 2~4");
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
		//Customer c1=new Customer("홍길동", -10);
		Customer c1=null;
		try {
			c1 = new Customer("홍");
		} catch (NameLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1);
	}
}
*/


