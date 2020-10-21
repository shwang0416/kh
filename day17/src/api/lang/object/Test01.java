package api.lang.object;

//import java.lang.*;
//자동 import되어있음

public class Test01 {

	public static void main(String[] args) {
		//남이 만든 object 클래스의 객체를 만들어보자!
		Object a = new Object();
		Object b = new Object();
		/*Class Object is the root of the class hierarchy. 
		 * Every class has Object as a superclass. All objects, 
		 * including arrays, implement the methods of this class.
		*/
		//메소드 써보기
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//해시코드(일련번호)출력. 객체를 구분하기 위한 번호이지 주소가 아님!
		//문제: a,b 각각 toString 기능을 사용하고 그 결과를 출력하세요
		System.out.println(a.toString());
		System.out.println(b.toString());
		//toString method returns a string that "textually represents" this object.
		//객체요약정보(리모컨 정보). @기준 왼쪽과 오른쪽으로 나뉜다.
		//왼쪽: 형태	오른쪽: 해시코드(일련번호hex).
		//해시코드는 객체마다 다르다
	}
}
