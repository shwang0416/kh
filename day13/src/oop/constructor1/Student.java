package oop.constructor1;

public class Student {
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	/*
	 * 	<생성자>
	 * 원래 사용하던 info를 생성자로 변경해서 사용
	 *	- 생성자는 void같은 반환형을 적을 수 없고
	 *	- 이름이 클래스이름과 동일
	 *	- 메소드와 비슷하게 생겼지만 "생성"하는 용도로 사용
	*/
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
	
	
	
}
