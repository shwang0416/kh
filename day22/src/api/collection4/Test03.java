package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * Test03 : 로그인 프로그램 구현
			Map에 다음의 회원정보를 저장해둔 뒤 사용자에게 아이디와 비밀번호를 입력받아 로그인을 수행하는 프로그램을 구현
			
			아이디	비밀번호
			admin	admin1234
			user	user1234
			master	master1234
			test	test1234
			만약 아이디와 비밀번호가 일치한다면 "로그인 성공" 을 출력
			만약 아이디와 비밀번호 중 하나라도 일치하지 않는다면 "로그인 실패"를 출력
		
		 */
		String id, pw;
		Scanner sc =new Scanner(System.in);
		Map<String, String> user =new HashMap<>();
		user.put("admin", "admin1234");
		user.put("user", "user1234");
		user.put("master", "master1234");
		user.put("test", "test1234");
		
		while(true) {
			System.out.println("아이디를 입력하세요: ");
			id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요: ");
			pw = sc.nextLine();
			
			// user.containsValue(pw)라고 쓰면 pw중에서 아무거나 써도 통과된다..!
			
// user.get(id).equals(pw) => get(id)로 그 아이디에 해당하는 패스워드를 뽑아와야 함.
			if (!(user.containsKey(id) && user.get(id).equals(pw))) {
				System.out.println("로그인실패");
			}
			else {
				System.out.println("로그인 성공!");
				break;
			}
		}
		
	}
}
