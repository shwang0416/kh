package api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * List: 순서가 유지되는 대용량 저장소
		 * 
		 * - ArrayList : 배열 형태로 붙어있는 저장소
		 * - LinkedList : 연결 형태로 붙어있는 저장소
		 */
//		int[] a = new int[5]; int를 5개 저장할 예정
//		List a = new ArrayList (); 뭘 만들지 설정 안 한것. 이러면 자동으로 Object가 저장됨(비추천)
		List<?> object1 = new ArrayList<> ();
		List<Object> object2 = new ArrayList<> ();
//		진짜 오브젝트를 저장하더라도 ? or Object로 표기한다.
		
//		Generic(제너릭: <'데이터타입'>)을 사용하여 형태를 명시!
		
		
		List<String> a = new ArrayList<String> ();	
		List<String> b = new LinkedList<> (); //오른쪽은 특별한 경우가 아니면 생략가능
		
		//객체 타입은 ArrayList가 아니라 List로 생성. // 추상화, 업캐스팅
		
		//데이터 추가: add(), Generic에 명시된 형태만 추가가 가능
//		a.add(100);
		b.add("한국");
		b.add("러시아");
		b.add("독일");
		b.add("일본");
		b.add("태국");
		
		//개수 확인: size()
		System.out.println(a.size());
		System.out.println(b.size());
		
//		if(a.size() == 0) { ArrayList a가 비었다면? 
		if(a.isEmpty()) {
			System.out.println("빔");
		}
		//저장소 출력
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
