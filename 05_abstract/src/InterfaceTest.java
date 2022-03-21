interface InterfaceA{
	void methodA();
	void print();
}

interface InterfaceB{
	void methodB();
	void print();
}

// ���h�ΰ� ���� interface�� ���߻���� ������
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
		SubAB a1=new SubAB(); // Ŭ������ �־�� �׽�Ʈ ������
	
		InterfaceA a2=new SubAB();
		InterfaceB a3=new SubAB();
		
		a1.print(); // 3�� ��� ��� ������
		a2.methodA(); // �����Ϸ��� InterfaceA�� ���� methodA(), print() ������
		a3.methodB(); // 		InterfaceB
		//a2�� methodB()�� ����Ϸ��� 
		SubAB newAB=(SubAB)a2;
		newAB.methodB();
		
		// �⺻���̵� ��üž�̵�, ���� �迭�� ���� �Ϳ��� ū ������ �Ѿ �� �����
		double d1=10;
		int d2=(int)d1; 
		
	}
}

