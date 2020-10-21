package oop.inheritance;

public class Test {
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
	public static void main(String[] args) {
		
		Phone [] phone = new Phone[5];
		int random;
		
		for(int i = 0; i < phone.length; i++) {
			random = (int)(Math.random()*2)+0;
			switch(random) {
			case 0: phone[i] = new Iphone12("iphone"); //number에 클래스종류 넣어서 임시확인
			//System.out.println(phone[i].getNumber());
			break;
			case 1: phone[i] = new Note20("note"); 
			//System.out.println(phone[i].getNumber());
			break;
			}
		}
		
		for(int i = 0; i < phone.length; i++) {
			random = (int)(Math.random()*2)+0;
			switch(random) {
			case 0: phone[i].call(); break;
			case 1: phone[i].sms(); break;
			}
		}
		
	}

}
