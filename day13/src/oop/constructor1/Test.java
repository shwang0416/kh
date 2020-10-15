package oop.constructor1;

public class Test {
	public static void main(String[] args) {
		//학생 객체를 생성
		
		
		//Student s1 = new Student();
		/*
		 * Student 클래스에 생성자가 있으면 위와같은 방식의
		 * 빈 객체 생성 불가
		 */
		
		Student s1 = new Student("PI", 80);
		//따라서 생성자를 사용한 방법으로만 객체 생성가능
		s1.print();
	}	
	
}
