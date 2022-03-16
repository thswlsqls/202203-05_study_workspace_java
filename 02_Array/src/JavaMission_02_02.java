/**
 요구사항 2
각각 출력

짝수 구구단만 출력
홀수스텝의 구구단만 출력

2 * 1 = 2             4 * 1 = 4
2 * 2 = 4             4 * 2 = 8   
...
2 * 9 = 18           4 * 9  = 18 
 */
public class JavaMission_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("====짝수단====");
		for(int i = 2; i<=8; i+=2) {
			for(int j = 1; j<=9; j++) {	
				System.out.println(i + " * " + j +" = "+ (i*j));
			}
			System.out.println();
		}
		
		System.out.println("====홀수단====");
		for(int i = 3; i<=9; i+=2) {
			for(int j = 1; j<=9; j++) {	
				System.out.println(i + " * " + j +" = "+ (i*j));
			}
			System.out.println();
		}

	}

}
