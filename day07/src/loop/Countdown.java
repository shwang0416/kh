package loop;

import java.util.*;
public class Countdown {

	public static void main(String[] args) throws InterruptedException {
		//입력한 숫자부터 0까지 카운트다운하기!
		Scanner scan = new Scanner(System.in);
		
		System.out.println("카운트다운 :");
		int num = scan.nextInt();
		
		for(;num >= 0;num--) {
			System.out.println(num);
			Thread.sleep(500L); //1000 밀리초(L) == 1초
		}
		
	}

}
