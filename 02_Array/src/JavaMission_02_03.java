/**
 * 
�䱸����3

- ���α׷��� �����ϸ� �޴��� ������� ������ �� �ִ� ���α׷��� �ۼ��ϼ���
- ������ �ִ� 10������ �Է��� �� �ִ�.
- �Էµ� ���������� ������ ����� ����Ѵ�.

*�޴�(1:�����Է�, 2:��缺��Ȯ��, 3:����, 4:���, 5:����) : __1__

1�� �޴��� �����ϸ�
����(1~100) : __5___

*�޴�(1:�����Է�, 2:��缺��Ȯ��, 3:����, 4:���, 5:����) : _ 2___

����list
25
60
5

*�޴�(1:�����Է�, 2:��缺��Ȯ��, 3:����, 4:���, 5:����) : __3___
���� : 90

*�޴�(1:�����Է�, 2:��缺��Ȯ��, 3:����, 4:���, 5:����) : _ 4___
��� : 30

*�޴�(1:�����Է�, 2:��缺��Ȯ��, 3:����, 4:���, 5:����) : _ 5___
���α׷� ����
 */ 

import java.util.Scanner;

public class JavaMission_02_03 {

	public static void main(String[] args) {
		
		int scoreCount = 0; 
		int scoreArrIndex = 0; 
		int sum = 0; 
		float avg = 0; 
		int [] scores = new int[10];  
		 
		while(true) { 
			System.out.println("�޴�(1:�����Է�, 2:��缺��Ȯ��, 3:����, 4:���, 5:����) : ");
			Scanner sc = new Scanner(System.in); 
			int c = sc.nextInt(); 
			 
			switch(c) {  
				case 1:  
					if(scoreCount>=10) { 
						System.out.println("���� �Է� Ƚ���� �ʰ��߽��ϴ�.");
						break; 
					} 
					System.out.print("����(1~100) :");
					int score = sc.nextInt(); 
					scoreCount += 1; 
					sum += score; 
					avg = (float)sum/scoreCount; 
					scores[scoreArrIndex++] = score; 
					break; 
				case 2:
					System.out.println("����list");
					for(int i = 0; i<scoreArrIndex; i++) {
						System.out.println(scores[i]); 
					} 
					break; 
				case 3: 
					System.out.println("���� : "+sum); 
					break; 
				case 4:
					System.out.println("��� : "+avg); 
					break; 
				case 5: 
					System.out.println("���α׷� ����");
					sc.close(); 
					return; 
				default: System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				break;	
			}
		}
	}
}
