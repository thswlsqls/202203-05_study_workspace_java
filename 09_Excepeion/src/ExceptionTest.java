import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			
		try {
			int num=s.nextInt();	// RuntimeException 계열의 예외는 예외 상황을 정확하게 확인하지 않으면 놓친다.(비정상종료)
			System.out.println(num); // 관련된 코드를 묶어서 
		}catch(InputMismatchException e) { // 안전장치
			// 예외가 발생하면, 예외 상황을 관리자에게 또는 파일로 제공하는 것이 매우 중요함
			e.printStackTrace();
		}						
								
		System.out.println("정상 종료");
	}	
}			


/**
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		try {
			int num=s.nextInt();//정수만		     //RuntimeException 계열의 예외는 예외 상황을 정확하게 확인 하지 않으면 놓친다.(비정상종료)
			System.out.println(num);          //관련된 코드를 묶어서 
		}catch(InputMismatchException e) {  //안전장치
			//예외가 발생하면 예외 상황을 관리자에게 또는 파일로 제공
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}
}
*/
