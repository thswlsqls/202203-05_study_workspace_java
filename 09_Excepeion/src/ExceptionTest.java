import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			
		try {
			int num=s.nextInt();	// RuntimeException �迭�� ���ܴ� ���� ��Ȳ�� ��Ȯ�ϰ� Ȯ������ ������ ��ģ��.(����������)
			System.out.println(num); // ���õ� �ڵ带 ��� 
		}catch(InputMismatchException e) { // ������ġ
			// ���ܰ� �߻��ϸ�, ���� ��Ȳ�� �����ڿ��� �Ǵ� ���Ϸ� �����ϴ� ���� �ſ� �߿���
			e.printStackTrace();
		}						
								
		System.out.println("���� ����");
	}	
}			


/**
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
			int num=s.nextInt();//������		     //RuntimeException �迭�� ���ܴ� ���� ��Ȳ�� ��Ȯ�ϰ� Ȯ�� ���� ������ ��ģ��.(����������)
			System.out.println(num);          //���õ� �ڵ带 ��� 
		}catch(InputMismatchException e) {  //������ġ
			//���ܰ� �߻��ϸ� ���� ��Ȳ�� �����ڿ��� �Ǵ� ���Ϸ� ����
			e.printStackTrace();
		}
		System.out.println("���� ����");
	}
}
*/
