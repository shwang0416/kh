package api.collection3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * Set : 
		 * - 전화번호부 형태의 저장소. 
		 * - 저장 순서가 무시되고 자체적인 기준에 추가되는 저장소. 
		 * - TreeSet, HashSet 
		 * 
		 * ※ List(선형구조: 출발 지점과 도착 지점이 하나씩 존재) <-> Set(비선형구조) index사용가능,평균
		 * 접근속도 느림<-> 전체를 아주 빠르게 접근, index사용 불가
		 * 
		 * Set의 구조 상 데이터 값의 중복이 불가능함. <-> List는 중복 가능
		 * 
		 * TreeSet : 정리 하고 빨리 찾기
		 * 
		 * 
		 * HashSet :정리 안하고 빨리 찾기
		 * 해시테이블에서 한 열에 너무 많은 데이터가 몰리는 경우 느려질 수 있음. 
		 * (그 데이터에 적합X) 반대로 적을 수록 금방 찾을 수 있어서 빨라짐.
		 * 
		 */

//		TreeSet<Integer> a =new TreeSet<> ();
		Set<Integer> a = new HashSet<>(); // 다형성을 이용한 업캐스팅
		Set<Integer> b = new TreeSet<>(); // 다형성을 이용한 업캐스팅

		// 데이터 등록: .add();
		a.add(55);
		a.add(32);
		a.add(47);
		a.add(85);
		a.add(60);
		a.add(17);
		a.add(90);
		
		b.add(55);
		b.add(32);
		b.add(47);
		b.add(85);
		b.add(90);
		b.add(60);
		b.add(17);
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		//개수 확인: .size()
		System.out.println(a.size());
		System.out.println(b.size());
		
		//탐색: .contains(E)
		// - a 저장소에 77이 있는지 확인
		// - b 저장소에 90이 있는지 확인
		
		System.out.println(a.contains(77));
		System.out.println(b.contains(90));
		
		//삭제: remove()
		a.remove(55); //데이터입력. List와 다르게 인덱스개념이 없으므로 int데이터 써도 된다.
		System.out.println(a);
		
		//차이점: get이 없다. 위치관리 X
		//		=> 확장 반복문만 가능
		//		=> Iterator 가능(내일 수업에서)
		
		//	a 전체출력
		for(int i : a) {
			System.out.println(i);
		}
	}

}
