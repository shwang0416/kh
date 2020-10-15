package oop.modifier4;

import oop.modifier3.House;
/*
 * 접근제한자
 * private	:잠금. this(자신)만 접근 가능
 * 			  변수에는 거의 붙임
 * 
 * package	:(아예 안쓰면) package에서만 사용가능.
 * 			  직접 쓰면 에러난다.
 * 
 * public	:공개. 다른 패키지에서 불러올수있음
 * 			  메소드에는 거의 붙임
 * 
 * protected =>상속 할 때 배움
 */
public class Test {

	public static void main(String[] args) {
		//다른 패키지에 존재하는 House의 객체를 생성
		
		House h1 = new House();
		
		h1.setArea("강남");
		//setArea()의  Visibility를 public으로 바꿔라.
	}

}
