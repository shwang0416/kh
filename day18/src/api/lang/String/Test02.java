package api.lang.String;

import java.util.Scanner;

public class Test02 {
	/*
		Test02
		사용자에게 "아이디"와 "비밀번호"를 입력받아서
		아이디 : khacademy , 비밀번호 : master 인 경우 화면에 "로그인 성공"을 출력
		아니면 "로그인 실패"를 출력하세요
		(참고 : Scanner에서 문자열 입력받는 명령은 .next() 입니다) 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String id = "khacademy";
		String pw = "master";
		
		String scanId, scanPw;
		
		while(true) {
			System.out.println("id를 입력해라");
			scanId = scan.next();
			System.out.println("pw를 입력해라");
			scanPw = scan.next();
			
			if(id.equals(scanId)&&pw.equals(scanPw)) {
				System.out.println("로그인 성공!");
				break;
			}
			else {
				System.out.println("로그인 실패");
			}
			System.out.println("------------------------");
		}
	}

}
