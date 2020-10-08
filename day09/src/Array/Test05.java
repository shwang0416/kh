package Array;

import java.util.Scanner;
public class Test05 {

	public static void main(String[] args) {
		int lotto [] = new int [6];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= lotto.length; i++) {
			System.out.println(i+"번째 숫자를 입력하세요 :");
			lotto[i-1] = scan.nextInt();
		}
		System.out.printf("로또번호: ");
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i]+", ");
		}
	}

}
