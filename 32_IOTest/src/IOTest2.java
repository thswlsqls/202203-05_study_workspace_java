import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class IOTest2 {
	private Collection<String> names;
	private BufferedReader br;
	
	public void IOTest2() throws IOException {
		names = new LinkedHashSet<String>();
		br=new BufferedReader(new InputStreamReader(System.in));
		
		this.Quiz();
	}
	
	public static void main(String[] args) throws IOException {
		IOTest2 test = new IOTest2();
		
	}
	public void Quiz() throws IOException {
		while(true) {
			try {
				menuCheck(inputMenuItem("�޴��� �Է��ϼ���. (1~4)"));
			}catch(IOException e) {
				System.out.println("�Է°��� Ȯ���ϼ���");
			}
			
		}
	}
	
	private String inputMenuItem(String title) throws IOException {
		System.out.print(title + ":");
		return br.readLine();
	}
	
	public void menuCheck(String menuItem) throws IOException {
//		
//		System.out.println("\n�޴��� �����ϼ���.");
//		System.out.println("1. �̸��߰�(�ߺ�X)");
//		System.out.println("2. �̸��˻� - Yes/No");
//		System.out.println("3. �߰��� �̸� ��� ����");
//		System.out.println("4. ���α׷� ����");
//		String str = br.readLine();

		if(menuItem.length()>=2) {
			System.out.println("1-4�� ���ڸ� ����  �Է����ּ���.");
			return;
		}
		char c = menuItem.charAt(0);
		
		switch(c) {
			case '1': 
				System.out.print("�߰��� �̸�: ");
				addName();
				break;
			case '2': 
				System.out.print("�˻��� �̸�: ");
				searchName();
				break;
			case '3': 
				System.out.println("====�߰��� �̸� ���====");
				printName();
				break;
			case '4': 
				userExit();
				break;
			default: 
				System.out.println("1-4�� ���ڸ�  �Է����ּ���.");
				throw new IOException("�޴��� 1~4������");
		}
	}
	
	public void addName() throws IOException {
		
		if(names.add(brReadLine())) {
			System.out.println("�Է� �Ϸ�");
		}
		
	}
	public void searchName() throws IOException {
		String message = "����";
		
		String searchName = inputMenuItem("�˻��� �̸�");
		
		for (String tmp : names) {
			if(searchName.equals(tmp)) {
				message = "�ִ�";
				break;
			}
		}
		
//		if(names.contains(brReadLine())) System.out.println("Yes");
//		else System.out.println("No");
	}
	public void printName() {
		String message = "�̸� ����";
		
		if(names.size()>0) {
			message = names.toString();
		}
		
		System.out.println(message);
	}
	public String brReadLine() throws IOException {
		return br.readLine();
	}
	private void userExit() {
		System.out.println("���α׷��� ���� ���� �մϴ�.");
		System.exit(0);
	}
	
}

