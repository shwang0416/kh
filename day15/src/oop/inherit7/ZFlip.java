package oop.inherit7;

public final class ZFlip extends Phone{

	protected String name = "ZFlip";
	public ZFlip () {
		this.name = "ZFlip";
	}
	@Override
	public void call() {
		System.out.println("zflip 의 전화 기능 사용!");
	}
	@Override
	public void sms() {
		System.out.println("zflip  의 문자 기능 사용!");
	}
	@Override
	public void camera() {
		System.out.println("zflip  의 카메라 기능 사용!");
	}
	

}
