import java.io.IOException;
import java.io.InputStream;
//CheckedException ==> ������ġ �ʼ� ����			==> ������ �ҰԿ�	//1. ������ API�� Ȯ��
public class ExceptionTest_02 {

	public static void main(String[] args) throws IOException {
		
		InputStream is=System.in;
		
//		try {
//			int num = is.read(); // �Էµ� ���ڸ� �ڵ�� ����
//			System.out.println(num);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		int num = is.read(); // �Էµ� ���ڸ� �ڵ�� ����
		System.out.println(num);
		
		System.out.println("���� ����");
	}
}

/**
import java.io.IOException;
import java.io.InputStream;
//CheckedException ==> ������ġ �ʼ� ����
public class ExceptionTest_02 {
	public static void main(String[] args) {
		
		InputStream is=System.in;
		
		try {
			int num = is.read();//�Էµ� ���ڸ� �ڵ�� ����
			System.out.println(num);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ����");
	}
}	
*/