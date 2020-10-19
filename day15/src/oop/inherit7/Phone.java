package oop.inherit7;

public abstract class Phone {
	protected String name;
	
	public Phone() {
		this.name = "Phone";
	}
	
	public void call() {
		System.out.println("폰 의 전화 기능 사용!");
	}
	public void sms() {
		System.out.println("폰  의 문자 기능 사용!");
	}
	public void camera() {
		System.out.println("폰  의 카메라 기능 사용!");
	}






}
