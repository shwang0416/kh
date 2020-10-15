package oop.constructor2;


public class Computer {
	
	//멤버변수
	private String name;
	private int price = -1;
	
	//생성자: 객체를 생성하는 방법을 정하는 구문
	//= 객체를 만들 때 반드시 있어야 하는 것은?
	/*
	 * 0. 이름 X 가격 X
	 * 1. 이름 O 가격 X
	 * 2. 이름 X 가격 O
	 * 3. 이름 O 가격 O
	 * 
	 * 가능한 경우 정하기 => 그에 해당하는 생성자 만들기
	 * 같은이름의 생성자가 n개 => "오버로딩"
	 */
	
	public Computer(String name) {
		this.name = name;
		this.price = 0;
	}
	
	public Computer(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
