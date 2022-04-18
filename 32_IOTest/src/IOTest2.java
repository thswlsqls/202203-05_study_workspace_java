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
				menuCheck(inputMenuItem("메뉴를 입력하세요. (1~4)"));
			}catch(IOException e) {
				System.out.println("입력값을 확인하세요");
			}
			
		}
	}
	
	private String inputMenuItem(String title) throws IOException {
		System.out.print(title + ":");
		return br.readLine();
	}
	
	public void menuCheck(String menuItem) throws IOException {
//		
//		System.out.println("\n메뉴를 선택하세요.");
//		System.out.println("1. 이름추가(중복X)");
//		System.out.println("2. 이름검색 - Yes/No");
//		System.out.println("3. 추가된 이름 모두 보기");
//		System.out.println("4. 프로그램 종료");
//		String str = br.readLine();

		if(menuItem.length()>=2) {
			System.out.println("1-4의 한자리 수를  입력해주세요.");
			return;
		}
		char c = menuItem.charAt(0);
		
		switch(c) {
			case '1': 
				System.out.print("추가할 이름: ");
				addName();
				break;
			case '2': 
				System.out.print("검색할 이름: ");
				searchName();
				break;
			case '3': 
				System.out.println("====추가된 이름 목록====");
				printName();
				break;
			case '4': 
				userExit();
				break;
			default: 
				System.out.println("1-4의 숫자를  입력해주세요.");
				throw new IOException("메뉴는 1~4까지만");
		}
	}
	
	public void addName() throws IOException {
		
		if(names.add(brReadLine())) {
			System.out.println("입력 완료");
		}
		
	}
	public void searchName() throws IOException {
		String message = "없다";
		
		String searchName = inputMenuItem("검색할 이름");
		
		for (String tmp : names) {
			if(searchName.equals(tmp)) {
				message = "있다";
				break;
			}
		}
		
//		if(names.contains(brReadLine())) System.out.println("Yes");
//		else System.out.println("No");
	}
	public void printName() {
		String message = "이름 없음";
		
		if(names.size()>0) {
			message = names.toString();
		}
		
		System.out.println(message);
	}
	public String brReadLine() throws IOException {
		return br.readLine();
	}
	private void userExit() {
		System.out.println("프로그램이 정상 종료 합니다.");
		System.exit(0);
	}
	
}

