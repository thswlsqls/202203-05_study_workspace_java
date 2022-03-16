import java.time.LocalDate;
import java.util.Scanner;

public class JavaMission_01_01 {
	
	/**
	 * # 풀이 1
	 * 월 - 일 메시지
	 * 입력값 - 매개인자 변수
	 * 출력값 - 리턴타입
	 */
	public String printMonthDay(int month) {
		if(month < 1 || month > 12) {
			return "월은 1~12까지 가능";
		}
		int days = 31;
		if(month == 2) {
			days = 28;
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}
		return (month + "월은"  + days + "일까지입니다.");
	}

	/**
	 * # 풀이 2
	 * Switch-case
	 * 
	 */
	public String printMonthDay_usingSwitch(int month) {
		if(month < 1 || month > 12) {
			return "월은 1~12까지 가능";
		}
		
		int days = 31;
		
		switch(month) {
		case 2:
			days = 28; // 메뉴에 필요한 동작, 객체 호출 
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		}
		return (month + "월은"  + days + "일까지입니다.");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력해주세요. ex) 2022");
		year = sc.nextInt();
		System.out.println("월을 입력해주세요. ex) 3");
		month = sc.nextInt();
		LocalDate inputDate = LocalDate.of(year, month, 1);
		int lom = inputDate.lengthOfMonth();
		
		System.out.println(year+"년 "+month+"월은 "+ lom +"일까지 입니다.");	
		
	}

}
