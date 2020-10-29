package api.collection4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//list
public class Test06_1 {
	public static void main(String[] args) {
		//Iterator : 반복자. 특정 저장소를 자동으로 순회하고 싶을 때 사용
		List<String> list =new ArrayList<>();
		list.add("빨강");
		list.add("주황");
		list.add("노랑");
		list.add("초록");
		list.add("파랑");
		list.add("남색");
		list.add("보라");

		//Iterator는 만드는 게 아니라 얻어내는 것
		// - Iterator에는 제네릭 형태를 반드시 지정해야 한다.
		// - Iterator를 이용하면 "전체를 추출"할 수 있다.
		// - 확장 반복문과 하는 행동이 비슷하다. (쉬운 수준에서 봤을 때 둘이 거의 같음)
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {		//origin 원래 있던 것을
			System.out.println(iter.next());
		}
		
		for(String str : list) {	//extended 확장해서 만든 것
			System.out.println(str);
		}
	}
}
