import java.io.IOException;
import java.util.Scanner;
// 재사용율을 높일려면, 코드를 분리, 중간 throws, 마지막 ui try/catch
public class UI {
	
	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("정상 종료");
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
//재사용율을 높일려면, 코드를 분리, 중간 throws, 마지막 ui try/catch
public class UI {
	
	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("정상종료");
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
