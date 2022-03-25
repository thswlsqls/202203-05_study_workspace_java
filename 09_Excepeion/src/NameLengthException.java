
public class NameLengthException extends RuntimeException { // 런타임익셉션은 언체크드라서 쓰로우 해주지 않아도 됨

	public NameLengthException(String message) {
		super(message);
	} 

}


/**
public class NameLengthException extends Exception {

	public NameLengthException(String message) {
		super(message);
	}

}
*/