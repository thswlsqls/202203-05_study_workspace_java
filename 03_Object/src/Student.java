/**
 * �л��� �й�, �̸�, ������ �ִ�.
 * �л��� ������ Ȯ���� �� �ִ�.
 * ��, ��� �������� ������ Ȯ��, �������� ����(ĸ��ȭ), ����ݿ� �ʱ���(������)
 * 
 *
 */

public class Student{
	//1. �Ϲ������� ĸ��ȭ ��Ģ�� ����, ��� ���������ڴ� pricate��
	private String studentNumber;
	private String name;
	private char gender;
	
	//3. �����ڴ� ���� �������� �ۼ� ������. - �ʱ�ȭ(�ʼ��� �����ϴ� ��)
	
	// overloading = �̸��� ����, �Ű����� ������ �ٸ� ������ �����ε��̶�� ��
	public Student() {};
	
	// �����ڴ� ���� ���� JVM�� �Ű����� ���� �⺻ �����ڸ� ������. 
	public Student(String studentNumber, String name, char gender) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	//2. �������� - setXXX, getXXX ��ź ���� 
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}


/**�л��� �й�, �̸�, ������ �ִ�.
�л��� ������ Ȯ���� �� �ִ�.
�� ��� �������� ������ Ȯ��-�������ٸ��´�=ĸ��ȭ, �Ѳ����� �ʱ�ȭ=������ 
*/
/**
 * 
 * 
 * public class Student {
	//1. �Ϲ������� ��� �����ʹ� private
	private String studentNumber;
	private String name;
	private char gender; //M, F
	//3. �����ڴ� �������� ���� ���� - �ʱ�ȭ(�ʼ��� ���� ��) - �����ڴ� �������� VM�� �Ű����� ���� �����ڸ� ����
	//overloading = �̸��� ����, �Ű����� ������ �ٸ� ����
	public Student() {}
	public Student(String studentNumber, String name, char gender) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	
	//2. �������� setXxx, getXxx ���� ����
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}

 */

