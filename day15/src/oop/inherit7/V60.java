package oop.inherit7;

public class V60 extends Phone {
	
	protected String name = "V60";
	
	public V60 ( ) {
		this.name = "V60";
	}
	
	@Override
	public void call() {
		System.out.println("v60 의 전화 기능 사용!");
	}
	@Override
	public void sms() {
		System.out.println("v60 의 문자 기능 사용!");
	}
	@Override
	public void camera() {
		System.out.println("v60 의 카메라 기능 사용!");
	}

}
