
public class ArrayTest {

	public static void main(String[] args) {
		// 1. ������ �����Ѵ�.
		int score=10; // ���ÿ� score�� ����ǰ�, xxxPool�� 10�� �����
		
		// 2. ����, ����, ���� ������ ������
		int [] scores; // ����
		scores = new int[3]; // ����
		scores[0] = 100; // �ʱ�ȭ
		scores[1] = 50;
		
		// Ȯ��
//		System.out.println(score);
		for(int i=0;  i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// i��� �ε��� ���� ���꿡 �ʿ��� ��찡 �ƴϸ� 
		//���������� ������ ������ 
		//�ӽú���(tmp)���� ���� �� �� �ִ� ����� ������ 
		for (int tmp: scores) {
			System.out.println(tmp);
		}

		
		
		System.out.println("#1----------------------");
		// #1 
		String [] sizes = { "S-44", "M-55", "L-66" };
		
		for (String size : sizes) {
			System.out.println(size);
		}
		
		System.out.println("#2----------------------");
		// #2
		// ����� S, M, L�� �����ϰ� S-44, M-55, L-66���� ���(�迭)
		char [] sizes1 = { 'S', 'M', 'L' }; // �迭�� ���ܷ� Ŭ������ ���� ������ ������ ���ÿ� �ʱ�ȭ new ���� ������ 
		int [] sizes2 = { 44, 55, 66 };
		
		int idx = 0;
		for(char c : sizes1) {
			System.out.println(c + "-" +sizes2[idx++]);
		}
		
		System.out.println("#3----------------------");
		// #3
		String [][] sizes3 = {{"S", "44"},{"M", "55"},{"L", "66"}};
		// sizes = new String[3][2]
		for(int i = 0; i < sizes3.length; i++) {
			System.out.println(sizes3[i][0] + "-" + sizes3[i][1]);
		}
		
		System.out.println("#4----------------------");
		// #4
		String [] sizes4 = {"S", "M", "L"};
		for(int i = 0; i<sizes4.length; i++) {
			System.out.println(sizes4[i] + "-" + (44 + i*11));
		}
		
		
		
		
		
	}

}
