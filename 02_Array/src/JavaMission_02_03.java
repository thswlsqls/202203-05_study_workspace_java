/**
 * 
요구사항3

- 프로그램을 실행하면 메뉴를 기반으로 동작할 수 있는 프로그램을 작성하세요
- 성적을 최대 10개까지 입력할 수 있다.
- 입력된 성적만으로 총점과 평균을 계산한다.

*메뉴(1:성적입력, 2:모든성적확인, 3:총점, 4:평균, 5:종료) : __1__

1번 메뉴를 선택하면
점수(1~100) : __5___

*메뉴(1:성적입력, 2:모든성적확인, 3:총점, 4:평균, 5:종료) : _ 2___

성적list
25
60
5

*메뉴(1:성적입력, 2:모든성적확인, 3:총점, 4:평균, 5:종료) : __3___
총점 : 90

*메뉴(1:성적입력, 2:모든성적확인, 3:총점, 4:평균, 5:종료) : _ 4___
평균 : 30

*메뉴(1:성적입력, 2:모든성적확인, 3:총점, 4:평균, 5:종료) : _ 5___
프로그램 종료
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
			System.out.println("메뉴(1:성적입력, 2:모든성적확인, 3:총점, 4:평균, 5:종료) : ");
			Scanner sc = new Scanner(System.in); 
			int c = sc.nextInt(); 
			 
			switch(c) {  
				case 1:  
					if(scoreCount>=10) { 
						System.out.println("성적 입력 횟수를 초과했습니다.");
						break; 
					} 
					System.out.print("점수(1~100) :");
					int score = sc.nextInt(); 
					scoreCount += 1; 
					sum += score; 
					avg = (float)sum/scoreCount; 
					scores[scoreArrIndex++] = score; 
					break; 
				case 2:
					System.out.println("성적list");
					for(int i = 0; i<scoreArrIndex; i++) {
						System.out.println(scores[i]); 
					} 
					break; 
				case 3: 
					System.out.println("총점 : "+sum); 
					break; 
				case 4:
					System.out.println("평균 : "+avg); 
					break; 
				case 5: 
					System.out.println("프로그램 종료");
					sc.close(); 
					return; 
				default: System.out.println("유효하지 않은 입력입니다.");
				break;	
			}
		}
	}
}
