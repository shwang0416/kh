package oop.inherit7;

public class IPhone12 extends Phone{

	protected String name = "IPhone12";
	public IPhone12() {
		this.name = "IPhone12";
	}
	@Override
	public void call() {
		System.out.println("아이폰12 의 전화 기능 사용!");
	}
	@Override
	public void sms() {
		System.out.println("아이폰12  의 문자 기능 사용!");
	}
	@Override
	public void camera() {
		System.out.println("아이폰12  의 카메라 기능 사용!");
	}

}
