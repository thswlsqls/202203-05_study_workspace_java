/**
 * 
 *  �䱸���� 1
	�������� Ȯ���ϼ���
	
	2���� �Է°��� ���
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
			System.out.println("2���� 9���� �� �Է����ּ���.");
			return;
		}
		for(int i = 1; i<=9; i++) {
			System.out.println(num + " * " + i +" = "+ (num*i));
		}
		
	}

}
