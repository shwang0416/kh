package oop.inheritance;

public abstract class Phone {
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
	protected String number;
	protected int price;
	
	//생성자
	public Phone() {}
	public Phone(String number) {
		setNumber(number);
	}
	public Phone(String number, int price) {
		setNumber(number);
		setPrice(price);
	}
	
	//gettersetter 추상메소드에도 필요?
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//추상메소드
	public abstract void call();
	public abstract void sms();
	}

