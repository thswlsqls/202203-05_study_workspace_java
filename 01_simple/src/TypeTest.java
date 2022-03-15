

import java.util.Scanner;

/**
 * 요구사항 input/output
 * 꼭 필요한 것은 코드로, 키보드 입력은 필수가 아님
 * Test(Yes, Error)
 * @author thswl
 *
 */

// 두 수를 입력받아서 앞에 숫자를 다음 숫자로 나눈 결과를 확인
public class TypeTest {

	public static void main(String[] args) {
//		int inputNumber1 = Integer.MAX_VALUE; // 011..11
//		int inputNumber2 = 20; 
		
		int num1, num2 = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// 숫자형 데이터는 연산할 때, 더큰 범위의 데이터 타입으로 형변환됨 
//		long sum = inputNumber1 + inputNumber2;
		float result = num1/num2;
		
//		System.out.println("총점 : " + sum);
		System.out.println("나눗셈 결과 : " + result);

	}
}
