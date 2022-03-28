
public class ServiceTest {
	public static void main(String[] args) {
		
//		NameService client1=new NameService();
//		NameService client2=new NameService();
		
		NameService client1=NameService.getInstance();
		NameService client2=NameService.getInstance();
		
		client1.add(new NameString("ȫ�浿"));
		
		System.out.println(client1);
		System.out.println(client2);
		
		System.out.println(client1.getNames());
		System.out.println(client2.getNames());
		
	}
}
