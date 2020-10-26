package api.collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		
		/*
		 * 사용자가 입력한 숫자를 5개 저장한 뒤 "개수"와 "전체저장소"를 출력하는 프로그램을 구현
		 * 
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		List<Integer> list  = new ArrayList<> ();
//		List<int> list  = new ArrayList<> ();	//에러
		//Generic에는 참조형만 저장 가능.
		//null이 포함될 수 있기 때문(원시형 데이터는 null 표현 불가)
		
		System.out.println("숫자를 5개 입력하시오.");
		for(int i = 0; i <5;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("데이터 개수: "+list.size());
		System.out.println(list);
		
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}
		//선형 저장소라면 (Iterable) 확장 반복문을 사용할 수 있다.
		for(int n: list) {
			//n == list.get(i)
			System.out.println(n);
		}
		sc.close();
	}
}
