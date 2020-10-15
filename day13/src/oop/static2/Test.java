package oop.static2;

public class Test {

	public static void main(String[] args) {
		//1과 다르게 하나의 객체로 계산
		//객체를 꼭 만들어야 계산가능??
		
		Calculator a = new Calculator();
		long total = a.plus(10L, 20L);
		System.out.println(total);
		
		total = a.plus(20L, 30L);
		System.out.println(total);
		
	}

}
