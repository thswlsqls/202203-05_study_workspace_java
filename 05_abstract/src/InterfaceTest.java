interface InterfaceA{
	void methodA();
	void print();
}

interface InterfaceB{
	void methodB();
	void print();
}

// 구햔부가 없는 interface는 다중상속이 가능함
class SubAB implements InterfaceA, InterfaceB{

	@Override
	public void methodB() {
		System.out.println("methodB");
	}

	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void print() {
		System.out.println("print");
	}
	
}

public class InterfaceTest {
	public static void main(String[] args) {
		SubAB a1=new SubAB(); // 클래스가 있어야 테스트 가능함
	
		InterfaceA a2=new SubAB();
		InterfaceB a3=new SubAB();
		
		a1.print(); // 3개 모두 사용 가능함
		a2.methodA(); // 컴파일러는 InterfaceA가 가진 methodA(), print() 가능함
		a3.methodB(); // 		InterfaceB
		//a2가 methodB()를 사용하려면 
		SubAB newAB=(SubAB)a2;
		newAB.methodB();
		
		// 기본형이든 객체탑이든, 같은 계열의 작은 것에서 큰 것으로 넘어갈 때 사용함
		double d1=10;
		int d2=(int)d1; 
		
	}
}

