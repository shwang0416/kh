package oop.multi3;

public class Test {
	
	public static void main(String[] args) {
		Galaxy galaxy =new Galaxy();
//		Phone galaxy =new Galaxy(); 이렇게 하면 Phone클래스 외의 메소드를 못 쓴다.
		
		int random;
		for(int i = 0; i < 5; i++) {
			random = (int)(Math.random() *5)+0;
			switch(random) {
			case 0: galaxy.call(); break;
			case 1: galaxy.sms(); break;
			case 2: galaxy.music(); break;
			case 3: galaxy.photo(); break;
			case 4: galaxy.play(); break;
			}
		}
	}

}
