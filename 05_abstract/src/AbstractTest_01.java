// 1. 추상 메서드가 있는 추상 클래스
abstract class SuperA{
	public void print() {
		System.out.println("SuperA's print()");
	}
	public abstract void methodA(); // 구현부를 경정할 수 없다.
}

class SubA extends SuperA{
	@Override
	public void methodA() {
		System.out.println("부모의 추상클래스를 사용하려면 자식은 무조건 추상메서드를 재정의 해야함");
	}
}

public class AbstractTest_01 {

	public static void main(String[] args) {
		SuperA a1;
//		a1 = new SuperA(); // 추상 클래스는 new할 수 없음. 메서드의 구현부가 없어서 실행할 수 없음
		a1 = new SubA(); //  
		a1.methodA();	
	}
}

/**
 * 
 * //1. 추상 메서드가 있는 추상 클래스
abstract class SuperA{
	public void print() {
		System.out.println("SuperA's print()");
	}
	public abstract  void methodA();//구현부를 결정할수 없다.
}

class SubA extends SuperA{
	@Override
	public void methodA() {
		System.out.println("부모의 추상 클래스를 사용하려면 자식은 무조건 추상 메서드를 재정의");
	}
	
}
public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1;
		//a1=new SuperA();   //추상 클래스는 new 못한다. 왜 methodA의 구현부가 없어서 실행할수 없으니깐
		
		a1= new SubA();
		a1.methodA();
	}
}

*/
