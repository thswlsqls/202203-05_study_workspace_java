import java.time.LocalDate;
import java.util.Scanner;

public class JavaMission_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month;
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է����ּ���. ex) 2022");
		year = sc.nextInt();
		System.out.println("���� �Է����ּ���. ex) 3");
		month = sc.nextInt();
		LocalDate inputDate = LocalDate.of(year, month, 1);
		int lom = inputDate.lengthOfMonth();
		
		System.out.println(year+"�� "+month+"���� "+ lom +"�ϱ��� �Դϴ�.");
		
		
	}

}
