import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("ABC123한글");
		
		InputStream is=System.in;
		
//		int input = is.read();
//		System.out.println(input +"" +(char)input); // 바이트는 2의 8승으로 256가지수임. 문자 바이트의  최대값은 음수를 쓰지 않기 때문에 255임. 
	
		// byte --> char 변경 필터 
		InputStreamReader isr=new InputStreamReader(is);
		int input = isr.read();
		System.out.println(input +"" +(char)(input+1)); 		
		
		// char --> char[] ==>String
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
		
		// 숫자만, 문자만, 이름만, 전화번호만 .... (업무 규칙)
		
	}
}
