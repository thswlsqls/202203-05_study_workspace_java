/**
 * 
 *  요구사항 1
	구구단을 확인하세요
	
	2단이 입력값일 경우
	2 * 1 = 2
	2 * 2 = 4
	...
	2 * 9 = 18
 *
 */

import java.util.Scanner;

public class JavaMission_02_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0 || num > 9) {
			System.out.println("2부터 9까지 중 입력해주세요.");
			return;
		}
		for(int i = 1; i<=9; i++) {
			System.out.println(num + " * " + i +" = "+ (num*i));
		}
		
	}

}
