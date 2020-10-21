package oop.inheritance;

public class Iphone12 extends Phone{
	/*
	 * 
	2. 다음과 같은 클래스들이 있을 때 상속 구조가 될 수 있도록 공통점을 뽑아서 상위 클래스를 만드시고 하시고 무작위로 5개의 객체를 생성하여 배열에 저장해보세요.
	저장된 배열의 모든 객체를 반복하며 각각 기능을 실행시켜보세요

	- 갤럭시노트20
		- 전화번호 : String(필수)
		- 가격 : int(선택)
		- 전화걸기 기능 : 갤럭시노트로 전화를 겁니다 출력
		- 문자보내기 기능 : 갤럭시노트로 문자를 보냅니다 출력
	- 아이폰12
		- 전화번호 : String(필수)
		- 가격 : int(선택)
		- 전화걸기 기능 : 아이폰으로 전화를 겁니다 출력
		- 문자보내기 기능 : 아이폰으로 문자를 보냅니다 출력
	 */
	
	


	//생성자
	public Iphone12() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Iphone12(String number, int price) {
		super(number, price);
		// TODO Auto-generated constructor stub
	}
	
	public Iphone12(String number) {
		super(number);
		// TODO Auto-generated constructor stub
	}
	
	//메소드
	@Override
	public void call() {
		System.out.println("아이폰으로 전화를 겁니다");
	}

	@Override
	public void sms() {
		System.out.println("아이폰으로 문자를 보냅니다");
		
	}
}
