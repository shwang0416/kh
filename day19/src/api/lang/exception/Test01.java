package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {

//	Error : 오류(실행이 불가능한 상황)
//	Exception : 예외(실행 후에 문제가 되는 상황)
	
//	주석을 풀면 바로 에러 발생
//	ㅁㄴ애ㅑㅓㄹ매ㅑㄴ얾ㄴ애ㅑㅓㄹㅁㄴㅇ래ㅑㅓ
	
//	예외
	public static void main(String[] args) {
		
		try { //감시블록 								경찰느낌
			Scanner scan = new Scanner(System.in);
			System.out.println("사과 개수를 입력하세요");
			int apple = scan.nextInt();
			System.out.println("인원수를 입력하세요");
			int people = scan.nextInt();
			
			System.out.println("한사람당 사과를 "+apple/people+"개씩 먹을 수 있어요.");
			System.out.println("사과는 "+ apple%people+"개가 남아요.");
		}
		catch(ArithmeticException e) { //얘는 lang이 아니라 util에 있는 
			//ArithmeticException이 발생하면  정보를 e라는 객체로 전달받겠다!
			//apple/people에 들어갈 수 있는 이상한 입력을 처리
			System.out.println("시람이 0명일리가 없다!");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 입력해라....");
		}
		
		//예외처리구문이 너무 길다
		//예외가 2개밖에 안생기는지 확신할 수 없다.
	}

}
