package oop.inheritance;

public class Note20 extends Phone {

	public Note20(String number, int price) {
		super(number, price);
		// TODO Auto-generated constructor stub
	}

	public Note20(String number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public Note20() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("노트20으로 전화를 겁니다");
		
	}

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("노트20으로 문자를 보냅니다");
		
	}

}
