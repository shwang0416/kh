package oop.method2;

public class Test {

	public static void main(String[] args) {
		Student a = new Student();
		
		//a.name = "홍길동";
		a.setName("홍길동");
		//a.score = -80; -80숫자가 그대로 들어감
		a.setScore(-80);
		//setScore메소드의 조건문으로 범위 밖의 숫자가 들어가면 변수에 저장되지 않음.
	}

}
