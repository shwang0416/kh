package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05 {
	public static void main(String[] args) {
		//List등 Collection을 보조하는 클래스 : Collections
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
	
		//List도 배열처럼 순서가 중요하므로 순서와 관련된 조작이 필요
		
		//1. 순서 뒤집기(reverse)		//오름차순,내림차순 뒤집을 때
		Collections.reverse(list);
		System.out.println(list);
		
		//2. 뒤섞기(shuffle)
		Collections.shuffle(list);
		System.out.println(list);
	}

}
