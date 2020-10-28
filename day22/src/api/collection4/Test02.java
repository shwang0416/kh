package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	/*
	 * Map
		Test02
		회원가입 프로그램 구현
		
		계속 사용자에게 id와 password를 입력받아 각각 key,value로 저장하는 프로그램 구현
		
		단, 아이디가 만약 사용중일 경우에는 "이미 사용중인 아이디입니다"를 출력하고 등록을 하지 않습니다. 
		아이디가 사용중이지 않을 경우에는 등록 후에 "가입이 완료되었습니다" 를 출력합니다.
	 */
	public static void main(String[] args) {
		Map<String, String> user = new HashMap<> ();
		
		Scanner scan =new Scanner(System.in);
		String stop, id, pw;
		while(true) {
			System.out.println("유저 가입 프로그램입니다. "
					+ "계속하시겠습니까? 계속하려면 y, 종료하려면 n 입력");
			stop = scan.nextLine();
			if("n".equals(stop)) {
				System.out.println("프로그램 종료");
				break;
			}
				
			System.out.println("아이디를 입력하세요: ");
			id = scan.nextLine();
			if(user.containsKey(id)) {
				System.out.println("이미 사용 중인 아이디입니다.");
				continue;
			}
			else {
				System.out.println("비밀번호를 입력하세요: ");
				pw = scan.nextLine();
				user.put(id, pw);
				System.out.println("가입이 완료되었습니다.");
			}
			System.out.println(user);
		}
		scan.close();
	}
}
