// 1. �߻� �޼��尡 �ִ� �߻� Ŭ����
abstract class SuperA{
	public void print() {
		System.out.println("SuperA's print()");
	}
	public abstract void methodA(); // �����θ� ������ �� ����.
}

class SubA extends SuperA{
	@Override
	public void methodA() {
		System.out.println("�θ��� �߻�Ŭ������ ����Ϸ��� �ڽ��� ������ �߻�޼��带 ������ �ؾ���");
	}
}

public class AbstractTest_01 {

	public static void main(String[] args) {
		SuperA a1;
//		a1 = new SuperA(); // �߻� Ŭ������ new�� �� ����. �޼����� �����ΰ� ��� ������ �� ����
		a1 = new SubA(); //  
		a1.methodA();	
	}
}

/**
 * 
 * //1. �߻� �޼��尡 �ִ� �߻� Ŭ����
abstract class SuperA{
	public void print() {
		System.out.println("SuperA's print()");
	}
	public abstract  void methodA();//�����θ� �����Ҽ� ����.
}

class SubA extends SuperA{
	@Override
	public void methodA() {
		System.out.println("�θ��� �߻� Ŭ������ ����Ϸ��� �ڽ��� ������ �߻� �޼��带 ������");
	}
	
}
public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1;
		//a1=new SuperA();   //�߻� Ŭ������ new ���Ѵ�. �� methodA�� �����ΰ� ��� �����Ҽ� �����ϱ�
		
		a1= new SubA();
		a1.methodA();
	}
}

*/
