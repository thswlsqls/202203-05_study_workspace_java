import java.io.IOException;
import java.io.InputStream;
//CheckedException ==> ������ġ �ʼ� ����			==> ������ �ҰԿ�	//1. ������ API�� Ȯ��
public class ExceptionTest_03 {

	public static void main(String[] args) throws IOException {
		
		InputStream is=System.in;
		
		int num = is.read(); // �Էµ� ���ڸ� �ڵ�� ����
		System.out.println(num);
		
		System.out.println("���� ����");
	}
}


/**
import java.io.IOException;
import java.io.InputStream;
//CheckedException ==> ������ġ �ʼ� ����                            ==> ������ �Ҳ���     //1. ������ API Ȯ�� 
   public class ExceptionTest_03 {
	public static void main(String[] args) throws IOException {

		InputStream is=System.in;


		int num = is.read();//�Էµ� ���ڸ� �ڵ�� ����
		System.out.println(num);


		System.out.println("���� ����");
	}
}	
*/