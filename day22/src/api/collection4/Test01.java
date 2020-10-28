package api.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K,V>
		// - 두 개의 데이터를 세트로 저장하는 저장소
		// - K : key, 이름의 역할을 수행하며 중복이 불가능하다(set) (자료형 상관X)
		// - V : value, 값의 역할을 수행하며 중복이 가능하다.
		// 넣은 순서는 무시된다. (자기 맘대로 오름차순 정렬함)
		
		// Map의 메소드
		// put() //일반적으로 add는 1개만 추가, put은 2개 추가할때 쓰는 이름이다. 
		// (addAll은 1개씩 여러번 추가한다는 뜻)
		/*
		 * List: 전체 처리도 간ㅇ하고 개별적인 처리도 가능한 위치(순서)가 있는 저장소
		 * Set : 
		 */
		
		//저장소 생성
		Map<String, Integer> map = new HashMap<>();
		
		//데이터 추가
		map.put("a", 10);
		map.put("b", null);
		
		//데이터 수정
		map.put("a", 20); //중복 key 다른 value
		// => value 수정됨
		
		//데이터 검색
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsKey(20));
		
		//데이터 개수 및 확인
		System.out.println(map.size()); //K와 V는 한 쌍이므로 한 개.
		System.out.println(map); //List Set은 []중괄호였는데 Map은 {}대괄호로 표기
		
		//데이터 삭제
		map.remove("b"); //key or key,value로 삭제 (구분을 위함)
		System.out.println(map);
		
		//데이터 추출 : key로 value를 불러오는 것만 가능 
		//(당연. 아이디->비번 찾기는 되지만 비번 -> 아이디는 못 찾음)
		
		//※ value를 int형태로 사용하면 위험!
		// => int는 null을 저장할 수 없으나 Integer는 null을 저장할 수 있기 때문
		// (null은 참조변수가 아무것도 안가리키고 있다는 뜻이다.)
//		int value = map.get("b"); //만약 b의 value가 null이라면 에러 발생
		Integer value = map.get("b"); //
		System.out.println(value);
		
	
	}
}
