package api.collection4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test04 {
	/*
	 * Test04 : 서바이벌 투표 프로그램 - 원하는 스타에게 투표하세요!
		사용자에게 투표하고 싶은 가수에 이름을 입력받아 투표를 진행하고 득표수를 알려주는 프로그램 구현
		
		(ex) 
		래퍼 이름 입력 : 로꼬
		[로꼬]를 입력하셨습니다. 현재 득표 수 : 1
		래퍼 이름 입력 : 스윙스
		[스윙스]를 입력하셨습니다. 현재 득표 수 : 1
		래퍼 이름 입력 : 로꼬
		[로꼬]를 입력하셨습니다. 현재 득표 수 : 2
		래퍼 이름 입력 : 그만
		프로그램을 종료합니다
		... 
	 * 
	 */
	
	// Q. 득표한 순위대로 나열하려면?
	// Q. 성을 빼고 이름만 입력해도 득표처리하려면?
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String st;
		int score = 0;
		Map<String, Integer> star = new TreeMap<>();

		
		while(true) {
			System.out.println("투표할 스타를 입력하세요: ");
			st =sc.nextLine();
			if("그만".equals(st)) {
				System.out.println("프로그램 종료");
				break;
			}
			else if("득표수".equals(st)) {
				System.out.println("<현재 득표수> : "+star);
			}
//			방법 1.
//			else if(!star.containsKey(st)) { //없으면
//				star.put(st, 1);
//			}
//			방법 2.
			Integer count = star.get(st);
			if(count == null) {
				count = 0;
			}
				score = count + 1;
				star.put(st, score);
				System.out.println("["+st+"] 를 입력하셨습니다. 현재 득표수 : "+ score);
		}
	}

}
