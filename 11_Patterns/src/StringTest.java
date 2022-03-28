
public class StringTest {
	public static void main(String[] args) {
		String s1="hi";
		String s2=new String("hi");
		String s3=new String("hi");
		String s4=s3;
		
		NameString n1=new NameString("hi");
		NameString n2=new NameString("hi");
		NameString n3=n2;
		
		System.out.println(s1==s2); //f
		System.out.println(s1.equals(s2)); // t
		System.out.println(s2==s3);	//f
		System.out.println(s3==s4);	//t
		
		System.out.println(n1 == n2);	//f
		System.out.println(n2 == n3);	//t
		
		System.out.println(s2.equals(s3));	//t
		System.out.println(n1.equals(n2));	//f -> t
		System.out.println(s1.equals(n1));	//f
//		System.out.println(s1==n1);
	}
}
