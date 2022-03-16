
public class ArrayTest {

	public static void main(String[] args) {
		// 1. 점수를 관리한다.
		int score=10; // 스택에 score가 저장되고, xxxPool에 10이 저장됨
		
		// 2. 국어, 영어, 수학 점수를 관리함
		int [] scores; // 선언
		scores = new int[3]; // 생성
		scores[0] = 100; // 초기화
		scores[1] = 50;
		
		// 확인
//		System.out.println(score);
		for(int i=0;  i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// i라는 인덱스 값이 연산에 필요한 경우가 아니면 
		//순차적으로 데이터 접근해 
		//임시변수(tmp)에서 접근 할 수 있는 방법을 제공함 
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
		// 사이즈를 S, M, L로 관리하고 S-44, M-55, L-66으로 출력(배열)
		char [] sizes1 = { 'S', 'M', 'L' }; // 배열은 예외로 클래스가 없기 때문에 생성과 동시에 초기화 new 생략 가능함 
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
