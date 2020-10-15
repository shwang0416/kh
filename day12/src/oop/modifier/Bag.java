package oop.modifier;

public class Bag {
	//멤버변수, 인스턴스변수 :객체의 정보저장
	
	//접근제한자 : 접근을 제한하는 키워드.
	//=> 강제로 setter메서드를 쓰도록 함.
	private String name;
	private int price;

	//객체의 기능을 구현하기 위한 영역
	//setter메소드 : 변수개수만큼 : 필터링

	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		if(price <0) {
			return;
		}
		this.price = price;
	}
	
	void info(String name, int Price) {
		this.setName(name);
		this.setPrice(Price);
	
	}
	void print() {
		System.out.println("이름 :"+this.name);
		System.out.println("가격 :"+this.price);
		
	}

}
