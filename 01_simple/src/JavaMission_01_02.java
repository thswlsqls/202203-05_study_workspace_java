import java.util.Scanner;

public class JavaMission_01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("A B C 중 선택해 입력해주세요.");
		c = sc.next().charAt(0);
		switch (c) {
			case 'A': System.out.println("A는 사과 배 포도를 좋아합니다."); break;
			case 'B': System.out.println("B는 배 포도를 좋아합니다."); break;
			case 'C': System.out.println("C는 포도를 좋아합니다."); break;
			default : System.out.println("유효하지 않은 문자입니다.");
		}
		
	}

}
