// 2. 추상클래스만 존재 - 클래스지만 생성자를 new 못하게 막는 경우(공통 객체로만 사용, 아직 확정짓기 어려운 경우임) 
// ex) UI프로그램의 이벤트, 터치를 롱터지, 드래그 등으로 분류함. 

abstract class SuperB{
	public void methodB() {}
}

class subB extends SuperB{ //자식은 상속만 받고 재정의는 필수가 아니다.
	
}

public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b;
//		b = new SuperB(); // 클래스지만 
		b = new subB();
//		b.methodB();
	}
}

/**
 * 
 * 
//2.추상클래스만 존재 - 클래스지만 생성자를 new 못하게 막는경우(공통 객체로만 사용, 아직 확정하기 어려운경우) ex)UI 프로그램 Event

abstract class SuperB{
	public void methodB() {}	
}

class SubB extends SuperB{  //자식은 상속만 받고 재정의는 필수가 아니다.
	
}

public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b;
		//b=new SuperB();  X
		b=new SubB();
		b.methodB();
	}
}

 * 
 */