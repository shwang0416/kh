package api.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
//		Student를 저장할 수 있는 List 구현
		
//		List 생성
		List<Student> list = new ArrayList<> ();
		
		//추가 명령: .add(E) (1, 2)
		
		//1
		Student st = new Student("PI",70);
		list.add(st);
		
		//2
		list.add(new Student("A",50));
		//1, 2 둘 다 같은 방법이다.
		
		System.out.println(list.size());
		//리스트 길이: 3
		
		
		//list안의 학생 멤버변수에 접근하기	(1, 2)
		System.out.println(list);
		//[api.collection2.Student@15db9742, api.collection2.Student@6d06d69c]
		//이러면 참조변수(리모컨)만 나온다.

		//1.
		System.out.println(list.get(0).getName());
		
		//2. 변수를 설정해서 출력해도 됨 
		Student tmp = list.get(0);
		System.out.println(tmp);
		
		//list안의 학생 멤버변수에 접근하기2
		//전체 데이터 출력
		
		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getScore());
		}
		
	}
}
