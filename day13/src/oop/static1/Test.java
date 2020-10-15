package oop.static1;

public class Test {

	public static void main(String[] args) {
		Calculator1 a = new Calculator1(10L,20L);
		long total = a.getTotal();
		System.out.println("합계: "+total);

		
		Calculator1 b = new Calculator1(20L,30L);
		total = b.getTotal();
		System.out.println("합계: "+total);
		
		
	}

}
