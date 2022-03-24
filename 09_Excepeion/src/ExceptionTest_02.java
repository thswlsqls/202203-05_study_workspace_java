import java.io.IOException;
import java.io.InputStream;
//CheckedException ==> 안전장치 필수 강조			==> 다음에 할게요	//1. 간단한 API를 확인
public class ExceptionTest_02 {

	public static void main(String[] args) throws IOException {
		
		InputStream is=System.in;
		
//		try {
//			int num = is.read(); // 입력된 문자를 코드로 리턴
//			System.out.println(num);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		int num = is.read(); // 입력된 문자를 코드로 리턴
		System.out.println(num);
		
		System.out.println("정상 종료");
	}
}

/**
import java.io.IOException;
import java.io.InputStream;
//CheckedException ==> 안전장치 필수 강조
public class ExceptionTest_02 {
	public static void main(String[] args) {
		
		InputStream is=System.in;
		
		try {
			int num = is.read();//입력된 문자를 코드로 리턴
			System.out.println(num);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("정상 종료");
	}
}	
*/