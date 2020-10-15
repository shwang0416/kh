package oop.method1;

public class Student {
	//멤버 변수(==인스턴스 변수)
	// - 역할: 객체의 정보를 저장.
	String name;
	int score;
	
	//멤버 메소드(==인스턴스 메소드)
	// - 역할: 객체의 코드(==기능)을 저장.
	
	void info(String name, int score) {
		this.name = name;
		this.score = score;
	}

	void print() {
		System.out.println("이름: " +name+", 점수:"+score);
	}
}
