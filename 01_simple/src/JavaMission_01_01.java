import java.time.LocalDate;
import java.util.Scanner;

public class JavaMission_01_01 {

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
