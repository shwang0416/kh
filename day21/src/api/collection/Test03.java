package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test03 {
	
	public static void main(String[] args) {
		/*
		 * List<String> 타입의 list를 내림차순으로 정렬해보세요.
		 * 
		 * ※ String은 뺄셈이 안되지만 수행해주는 메소드有
		 * 	: compareTo();
		 */
		
		List<String> list = new ArrayList<> ();
		list.add("Alice");
		list.add("Kris");
		list.add("Beth");
		list.add("Eric");
		list.add("Brian");
		list.add("Dianna");
		
		System.out.println("정렬 전: "+ list);
		
/*		인터페이스로 함수형객체
 * 		1단계.
 * 		Comparator<String> c =new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);	//내림차순
//				this.length()-anotherString.length();
			}
		};
		
		2단계.	
		Comparator<String> c = (a, b) -> {
				return b.compareTo(a); // b - a
		};
*/		
//		3단계.(한 줄 이상의 코드는 못 씀)
		Comparator<String> c = (a, b) -> b.compareTo(a); // b - a
		
		
		Collections.sort(list,Collections.reverseOrder());
		//이것도 가능
		
		list.sort(c);
		Collections.sort(list,c);
		// Q. 두 개의 차이점이 뭔가요?
		/*
		 * A. 같습니다.
			원래는 Collections로만 사용했었는데
		 * 	list.sort가 1.8부터 생겼어요

			list.sort는 무조건 Comparator가 들어가야해요
			Collections.sort는 기본적으로 오름차순으로 설정되어 있구요.
		 */

		
		System.out.println(list);
		
	}

}
