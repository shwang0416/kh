package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		/*
		 * 사다리타기 게임 만들기
		 * 네이버에서 "사다리게임"을 검색한 뒤 나오는 프로그램을 참고하여 만들어보세요.
		 * 
		 * 1.인원 수 설정 (최소: 3)
		 * 2.이름 입력
		 * 3.당첨항목 입력
		 * 4.추첨 및 결과 발표
		 */
		
		System.out.println("인원 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String temp;
		
		List<String> name = new ArrayList<> ();
		List<String> result = new ArrayList<> ();
		
		for(int i = 0; i < num; i++) {
			System.out.println((i+1)+"번째 이름을 입력하세요.");
			temp = sc.nextLine();
			name.add(temp);
		}
		for(int i = 0; i < num; i++) {
			System.out.println((i+1)+"번째 당첨항목을 입력하세요.");
			temp = sc.nextLine();
			result.add(temp);
		}
		
		Collections.shuffle(name);
		
		for(int i = 0; i< name.size();i++) {
			System.out.print(name.get(i)+ "	--->	"+result.get(i));
			System.out.println();
		}
	}
}
