package loop2;

import java.util.Scanner;

public class Test04 {
/*
 * 사용자에게 홀수를 입력받는 프로그램을 구현.
 * 짝수를 입력받으면 종료.
 * 입력받은 짝수의 합 출력하기.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=3;
		int result=0;
		while(true) {
			System.out.println("홀수를 입력하시오."
					+ "(짝수를 입력하면 프로그램 종료)");		
				num = scan.nextInt();
				if(num%2==0) {
					System.out.println("프로그램이 종료되었습니다.");
					break;
				}
				result +=num;
				System.out.println(result);
		}
			
		
	}

}
