package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<> ();
		for(int i = 1; i<=10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
		//오름차순: Ascecending Asc 은 sort
		
		//내림차순 정렬 Descending (desc)
//		Comparator라는 인터페이스를 익명중첩클래스 형태로 생성하여 코드를 작성
		
//		=> 재정의한 메소드에서 0 or 음수를 반환하게 되면 현상유지
//		=> 재정의한 메소드에서 양수를 반환하게 되면 두 자리를 바꾸라는 뜻
		
//		Comparator, Comparable
		Comparator<Integer> c = new Comparator<Integer>() {
//								익명클래스에서는 제너릭에 자료형 생략불가
/*
 * 				int	compare(T o1, T o2)
 * 
 * 				: Compares its two arguments for order.
 */
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2; // 오름차순
//				return o2 - o1; // 내림차순

//					<원리>
			
//				if(o1 < o2)
//					return 1;
//				else
//					return -1;
			}
		};
		
		Comparator<Integer> d = (o1, o2)-> o2 - o1;
	
	/*	이것도 가능
	 * Comparator<Integer> d = (o1, o2)-> {
			return o2 - o1;
	}*/
	/*
	 * 단, 인터페이스의 (추상클래스 안 됨)
	 * 		메소드가 하나만 있을 때 
	 * 	람다식(=추론식) 사용 가능.
	 */
		
		Collections.sort(list,c); //c에서 시키는 대로 정렬해라!
		/*
		 * 	sort(Comparator<? super E> c)
		 * 
			: Sorts this list according to the order 
			induced by the specified Comparator.
		 */
		System.out.println(list);

	}
}
