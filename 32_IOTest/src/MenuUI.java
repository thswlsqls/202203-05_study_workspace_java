import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;

public class MenuUI {
	
	private BufferedReader br;  //t5-2
	private Collection<String> names;
	
	public MenuUI() {
		//=new Scanner(System.in)
		br=new BufferedReader(new InputStreamReader(System.in));  //t5-3
		names=new HashSet<String>();
		//t3
		menu();
		
		//t2
		//System.out.println("        Ϸ ");
	}
	
	
	private void menu() {
		
		while(true) {
			//menuCheck("4");  //t4   
			try {
				menuCheck(inputMenuItem("메뉴를 선택 (1~4)")); //t5
			} catch (IOException e) {
				System.out.println("입력을 확인하세요.");
				//e.printStackTrace();
			}  catch(RuntimeException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
		
	}
	/**Ÿ  Ʋ      ְ     ڿ      
	 * @throws IOException */
	private String inputMenuItem(String title) throws IOException {  // ߰ 
		System.out.print(title+":");
		return br.readLine();  //t5-1
	}


	private void menuCheck(String menuItem) throws IOException {
		switch(menuItem) {
		case "1":
			addName();//t6
			break;
		case "2":
			isName(); //t7
			break;
		case "3":
			getNames();//t8
			break;
		case "4":
			userExit();
			break;
		default:
			throw new IOException("메뉴 입력은 1~4으로 해주세요.");	  //t5-4
		}
		
	}

	//t9-1
	private void getNames() {
		String message="없음";
		
		if(names.size() >0)
			message=names.toString();
		
		System.out.println(message);
	}

	//t9-3
	private void isName() throws IOException {
		String message="없음";
		
		String searchName=inputMenuItem("찾을 이름: ");
		
		for (String tmp : names) {
			if(searchName.equals(tmp)) {
				message="있음";
				break;
			}
		}
		
		System.out.println(message);
	}

	//t9-2
	private void addName() throws IOException {
		String name=inputMenuItem("추가할 이름: ");
		
		if(names.add(name))
			System.out.println("");		
	}

	private void userExit() throws IOException {
		System.out.println("");
		//    
//		System.exit(0);//       
		throw new RuntimeException("종료합니다."); //
	}
	public static void main(String[] args) {		
		new MenuUI();		
		//t1
		System.out.println("end");  
	}
}


// 팀미션 
// 액티비티 점검 
// ui지정 

//추가과제 SYSTEM.EXIT(0)을 예외를 활용해 수정하기