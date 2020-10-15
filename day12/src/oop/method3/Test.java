package oop.method3;

public class Test {

	public static void main(String[] args) {
		PhoneList note20 = new PhoneList();
		PhoneList iphone12 = new PhoneList();
		PhoneList fold2 = new PhoneList();
		
		note20.setInfo("갤럭시노트20", "SKT", 150, 24);
		iphone12.setInfo("아이폰12", "KT", 170, 24);
		fold2.setInfo("갤럭시폴드2", "LG", 240, 30);
		
		note20.basePrint();
		note20.print();
		iphone12.print();
		fold2.print();
		
	}

}
