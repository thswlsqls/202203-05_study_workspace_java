

// 요구사항 분석, 해석 오류 없도록 함, 중복 코드 제거함
public class IfTest {

	public static void main(String[] args) {
		int num1 = -4;
		
		if(num1 == 0) {
			System.out.println("0");
		}else if(num1 % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		if(num1 > 0) {
			System.out.println("양수");
		}else if(num1 < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}

	}

}
