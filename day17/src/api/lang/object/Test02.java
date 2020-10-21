package api.lang.object;

import java.util.Scanner;

//import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//Object는 모든 클래스의 조상
		// = Object에는 아무거나 넣을 수 있다
		// = 업캐스팅
		
		//Object가 모든 클래스의 조상이라는 증거
		Object a = 10; // int를 Object에 업캐스팅하여 보관
		Object b = "hello"; // String을 Object에 업캐스팅하여 보관
		Object c = 3.14;
		Object d = new int[5];
		Object e = new Scanner(System.in);
		
		//아무거나 넣으면 넣을 때는 편한데 쓸 때 힘들다..
		
		//형태검사(instanceof 연산자)
		//a는 int인가? => true
		//b는 int인가? => false ...
		
		System.out.println(a instanceof String);
		//이항연산자. a가 String인가? => false
		System.out.println(b instanceof String);
		//이항연산자. b가 String인가? => true
	}

}
