package loop2;

public class Test01 {

	public static void main(String[] args) {
		// Test01_while구문
		
		//비교를 위해 for과 while로 각각 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int j = 1;
		while(j <= 10) {
			System.out.println(j++);
		}
	}
/*
 * for		횟수 반복, 구간 반복
 * while	특정 시점까지 반복(횟수모름)
 * do-while	먼저 한 번 실행하고 반복
 */
}
