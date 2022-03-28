import java.util.ArrayList;
import java.util.Collection;

/** �̸� ����� ���� ����ڰ� ���ͼ� ����(����)�� �� �ִ�. */
public class NameService {

	private Collection<NameString> names;
	//a3) 
	private static NameService s;
	
	//a1)�����ڸ� ���� (new) 1���� �޸𸮿� ����ؼ� ����ʹ�. 
	private NameService() {
		names=new ArrayList<NameString>();
	}
	
	/* �̸��� ������ ����� ���� - �� �̸��� �ߺ� �������� �ʴ´�. */
	public boolean add(NameString name) {
		return names.add(name);
	}
	//a2)
	public static NameService getInstance() {
		if(s==null) s=new NameService(); // �޸𸮿� ������ �ø���, ������ ������
		
		return s;
	}
	
	/* ���� �̸����� ���� �Է��� �̸��� ������ ���θ� Ȯ�� */
	
	/* ��ϵ� ��� �̸��� Ȯ�� */
	public Collection<NameString> getNames(){
		return names;
	}
	
}
