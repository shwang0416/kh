package loop2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하시오.(0이면 종료)");
			int num = scan.nextInt();
			
			if(num == 0)
				break;
			System.out.println(num);
		}
	}

}
