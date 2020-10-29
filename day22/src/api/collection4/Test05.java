package api.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test05 {
	public static void main(String[] args) {
		
		// Map도 전체 출력이 가능하긴 하다(단지 복잡할 뿐)
		//저장소
		Map<String, String> user =new HashMap<>();
		
		//데이터 추가
		user.put("admin", "admin1234");
		user.put("user", "user1234");
		user.put("master", "master1234");
		user.put("test", "test1234");
		
		// 추론
		// 1. key만 알면 value도 불러올 수 있다.
		// 2. Map에서 key만 뽑아내는 명령이 있는지 알아야 한다.
		// 3. Map에서 key만 놓고보면 Set 형태다.  (중복X, 순서)
		
		//(1) Map에 있는 key들만 모아서 Set으로 추출 : .keySet();
		Set<String> set = user.keySet();
		System.out.println(set);
		
		//(2) Set을 확장 반복문으로 반복하여 id에 접근
		//(3) 비밀번호는 id를 이용해서 get 명령으로 불러온다.
		for(String id : set) {
			System.out.println("id : "+ id);
			System.out.println("pw : "+ user.get(id));
		}
	}
}
