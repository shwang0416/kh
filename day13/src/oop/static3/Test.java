package oop.static3;

public class Test {

	public static void main(String[] args) {
		//정적 메소드(static method)는 객체없이 사용가능
		long total = Calculator.plus(10L, 20L);
		System.out.println(total);
	}

}
