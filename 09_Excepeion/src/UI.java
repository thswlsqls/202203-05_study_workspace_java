import java.io.IOException;
import java.util.Scanner;
// �������� ���Ϸ���, �ڵ带 �и�, �߰� throws, ������ ui try/catch
public class UI {
	
	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���� ����");
	}

	private static void methodA() throws IOException {
		methodB();
	}
	
	private static void methodB() throws IOException {
		methodC();
	}

	private static void methodC() throws IOException {
		// new Scanner(System.in).nextInt();
		System.in.read();
	}
	
}


/**
 * import java.io.IOException;
import java.util.Scanner;
//�������� ���Ϸ���, �ڵ带 �и�, �߰� throws, ������ ui try/catch
public class UI {
	
	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("��������");
	}
	private static void methodA() throws IOException {
		methodB();	
	}
	private static void methodB() throws IOException {
		methodC();
	}
	private static void methodC() throws IOException {
		//new Scanner(System.in).nextInt();
		System.in.read();
	}	
}
*/
