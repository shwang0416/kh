package api.collection;

import java.util.ArrayList;
import java.util.List;
/* < List의 명령어 요약 >
 * 
 * 추가: add(E)
 * 크기: size()
 * 추출: get(index)
 * 확인: contains(E)
 * 삭제: remove(index) remove(E)
 * 
 */
public class Test01 {
	// - 데이터 삭제 : remove()
	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		
		for(int i = 10; i <=100; i=i+10) {
			list.add(i);
		}
		
		list.remove(0); //0번 위치 데이터 삭제
//		list.remove(10); //10번 위치 데이터 삭제 //데이터 10을 지운다로 인식X
		
		
		list.remove(new Integer(50));
		list.remove(Integer.valueOf(50));
//		둘 다 O. Integer라는 사실을 알려주기만 하면 ok. list안의 값이 Integer이기 때문	
		
		
		System.out.println(list);
		
		//전체삭제
		list.clear();
		System.out.println(list);
	}
	
}

