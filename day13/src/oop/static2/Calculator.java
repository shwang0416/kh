package oop.static2;

public class Calculator {
	/*
	 * 기존의 멤버 메소드의 문제점 :
	 * -멤버 필드와 연계한다
	 * 해결책 :
	 * -멤버 필드를 없애고 매개변수로 데이터를 즉시 받아온다.
	 */
	public long plus(long a, long b) {
		return a + b;
	}
}
