package day07;

import java.util.*;
public class Countdown {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 :");
		int num = scan.nextInt();
		
		for(;num >= 0;num--) {
			System.out.println(num);
		}
		
	}

}
