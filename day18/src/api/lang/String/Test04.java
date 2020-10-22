package api.lang.String;


import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		String input, nickName, forbidden = "운영자";
		int inputLen = -1;
		boolean nickNameOK;
		boolean adminOK;
		
		Scanner scan =new Scanner(System.in);
		
		while(true) {
			System.out.println("닉네임 입력해라");
			input = scan.nextLine();
			inputLen = input.length();
			
			nickNameOK = inputLen >= 2 && inputLen <= 6;
			adminOK = !input.contains(forbidden);
			
			if(nickNameOK && input != null && adminOK) { 
				// if조건문에서 input이 null이면 어떻게되나?
				//1. nullpoint에러
				//2. if문이 안돌아감(while문처럼)
				
				nickName = input;
				System.out.println("닉네임 생성에 성공");
				System.out.println("유저 닉네임: " + nickName);
				break;
			}
			else {
				System.out.println("다시해");
			}
			System.out.println("-------------------------------");
		}
	}

}
