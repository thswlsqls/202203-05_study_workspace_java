import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("ABC123�ѱ�");
		
		InputStream is=System.in;
		
//		int input = is.read();
//		System.out.println(input +"" +(char)input); // ����Ʈ�� 2�� 8������ 256��������. ���� ����Ʈ��  �ִ밪�� ������ ���� �ʱ� ������ 255��. 
	
		// byte --> char ���� ���� 
		InputStreamReader isr=new InputStreamReader(is);
		int input = isr.read();
		System.out.println(input +"" +(char)(input+1)); 		
		
		// char --> char[] ==>String
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
		
		// ���ڸ�, ���ڸ�, �̸���, ��ȭ��ȣ�� .... (���� ��Ģ)
		
	}
}
