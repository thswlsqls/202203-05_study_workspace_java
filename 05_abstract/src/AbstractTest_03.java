// 3. 추상 클래스 = 모든 추상메서드일 경우 권장하지 않는다. 왜? 다중상속이 안됨. ===> interface로 가능함. 
abstract class SuperC1{
	abstract void methodC1();	
}

abstract class SuperC2{
	abstract void methodC2();
}

//class SubC extends SuperC1, SuperC2 {
class SubC extends SuperC1 {	
	@Override
	void methodC1() {
		
	}
}

public class AbstractTest_03 {
	public static void main(String[] args) {
		
	}
}
