package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
/*
 * 프레임워크: 강력한 규칙으로 사용자가 그대로 이용할 수 밖에 없도록 만들어진 도구 모음
 * 자바 컬렉션 프레임워크(JCF) : 자바에서 대용량 데이터를 관리하기 위해 만들어진 프레임워크
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		
		//전화번호부 형식의 저장소 : TreeSet : 입력 순서가 무시(가나다순으로 재정렬)
		Set a = new TreeSet();
		
		//코로나명부 형식의 저장소 : ArrayList : 입력 순서가 유지
		List b = new ArrayList();
		
		//데이터추가: .add()
		a.add("태연");
		a.add("소지섭");
		a.add("휴 그렌트");
		a.add("제임스 엠버");
		a.add("웨스 앤더슨");
		
		b.add("태연");
		b.add("소지섭");
		b.add("휴 그렌트");
		b.add("제임스 엠버");
		b.add("웨스 앤더슨");

		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
