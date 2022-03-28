import java.util.ArrayList;
import java.util.Collection;

/** 이름 목록은 여러 사용자가 들어와서 조작(공유)할 수 있다. */
public class NameService {

	private Collection<NameString> names;
	//a3) 
	private static NameService s;
	
	//a1)생성자를 막고 (new) 1번만 메모리에 등록해서 쓰고싶다. 
	private NameService() {
		names=new ArrayList<NameString>();
	}
	
	/* 이름을 여러개 등록이 가능 - 단 이름은 중복 저장하지 않는다. */
	public boolean add(NameString name) {
		return names.add(name);
	}
	//a2)
	public static NameService getInstance() {
		if(s==null) s=new NameService(); // 메모리에 없으면 올리고, 있으면 리턴함
		
		return s;
	}
	
	/* 기존 이름에서 새로 입력할 이름과 같은지 여부를 확인 */
	
	/* 등록된 모든 이름을 확인 */
	public Collection<NameString> getNames(){
		return names;
	}
	
}
