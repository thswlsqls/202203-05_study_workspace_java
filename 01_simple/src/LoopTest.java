import java.util.Scanner;

public class LoopTest {
	
	public static void main(String[] args) {
		int i = 0;
//		while(i <= 10) {
//			System.out.println(i++);
//		}
		
		for(i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�޴�(Q or q ����)");
			String menu = sc.nextLine();
			
//			if(menu.equals("Q")||menu.equals("q")) {
			if(menu.equalsIgnoreCase("Q")) {
				sc.close();
				break;
			}
		}
		
	}

}
