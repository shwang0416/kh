package api.lang.etc;

public class Test01 {
	public static void main(String[] args) {
		//java.lang.Math 클래스
		/*
		 * 생성자가 없다.
		 * 인스턴스생성이 불가능하다(편하게쓰게 static or 생성을 제한(대행)하는경우)
		 * 모든 메소드에 static이 붙었으므로 인스턴스없이도 편하게 쓰라고 그렇게 한 것!
		 */
		//abs() 절대값
		int a = 3;
		int b = 55;
		System.out.println(Math.abs(a - b));
		
		//round() 반올림
		double c = 1.5;
		System.out.println(Math.round(c));
		
		//random() 무작위실수 (0이상1미만) -------------->Random클래스가 더 잘함
		double d = Math.random();
		System.out.println(d);
		
		//pow 거듭제곱
		System.out.println(2^10);
		System.out.println(Math.pow(2,10));
		
		//PI 원주율
		System.out.println(Math.PI);
	}
}
