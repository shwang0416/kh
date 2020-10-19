package oop.inherit7;

public class Test {

	public static void main(String[] args) {
		//Phone p = new Phone();
		ZFlip zflip = new ZFlip();
		zflip.call();
		zflip.sms();
		zflip.camera();
		
		V60 v60 = new V60();
		v60.call();
		v60.sms();
		v60.camera();
		
		IPhone12 iphone12 = new IPhone12();
		iphone12.call();
		iphone12.sms();
		iphone12.camera();
	}

}
