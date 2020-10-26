package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {
	/*
	 * List를 만들어 이번 주 예상 로또 번호를 6개 추첨해 저장 후 출력
	 * 단, API를 이용하여 "중복이 없도록" 저장소에 추가
	 */
	public static void main(String[] args) {
		List <Integer>lottery = new ArrayList<> ();
		List <Integer>lottery2 = new ArrayList<> ();
		int temp;
		
		//1.Random 클래스 + for문							//1, 2에서 random방식 + 반복방식의 조합은 상관없음
		Random r =new Random();
				
		for(int i=0; i< 6; i++) {
			temp = r.nextInt(45)+1; // 1부터 45개
			
			if(!lottery.contains(temp)) {
				lottery.add(temp);
			}
			else {
				i--;
			}
		}
		
		//2.Math.random() 함수 + while문
		while(lottery2.size() < 6) {
			temp = (int)(Math.random()*45)+1;

			if(!lottery2.contains(temp))
				lottery2.add(temp);
		}
		
		//출력
		System.out.println("로또 1");
		print(lottery);
		System.out.println("로또 2");
		print(lottery2);
	}
	public static void print(List<Integer> list) {
		for(int n: list) {
			System.out.print(n+" ");
			System.out.println();
		}
	}
}
