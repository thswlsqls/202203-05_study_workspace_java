// 2. �߻�Ŭ������ ���� - Ŭ�������� �����ڸ� new ���ϰ� ���� ���(���� ��ü�θ� ���, ���� Ȯ������ ����� �����) 
// ex) UI���α׷��� �̺�Ʈ, ��ġ�� ������, �巡�� ������ �з���. 

abstract class SuperB{
	public void methodB() {}
}

class subB extends SuperB{ //�ڽ��� ��Ӹ� �ް� �����Ǵ� �ʼ��� �ƴϴ�.
	
}

public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b;
//		b = new SuperB(); // Ŭ�������� 
		b = new subB();
//		b.methodB();
	}
}

/**
 * 
 * 
//2.�߻�Ŭ������ ���� - Ŭ�������� �����ڸ� new ���ϰ� ���°��(���� ��ü�θ� ���, ���� Ȯ���ϱ� �������) ex)UI ���α׷� Event

abstract class SuperB{
	public void methodB() {}	
}

class SubB extends SuperB{  //�ڽ��� ��Ӹ� �ް� �����Ǵ� �ʼ��� �ƴϴ�.
	
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