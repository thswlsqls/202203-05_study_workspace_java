import java.time.LocalDate;
import java.util.Scanner;

public class JavaMission_01_01 {
	
	/**
	 * # Ǯ�� 1
	 * �� - �� �޽���
	 * �Է°� - �Ű����� ����
	 * ��°� - ����Ÿ��
	 */
	public String printMonthDay(int month) {
		if(month < 1 || month > 12) {
			return "���� 1~12���� ����";
		}
		int days = 31;
		if(month == 2) {
			days = 28;
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}
		return (month + "����"  + days + "�ϱ����Դϴ�.");
	}

	/**
	 * # Ǯ�� 2
	 * Switch-case
	 * 
	 */
	public String printMonthDay_usingSwitch(int month) {
		if(month < 1 || month > 12) {
			return "���� 1~12���� ����";
		}
		
		int days = 31;
		
		switch(month) {
		case 2:
			days = 28; // �޴��� �ʿ��� ����, ��ü ȣ�� 
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		}
		return (month + "����"  + days + "�ϱ����Դϴ�.");
		
	}
	
	
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
