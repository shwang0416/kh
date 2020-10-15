package oop.method4;

public class StudentList {
	String name;
	int level;
	int korean;
	int english;
	int math;
	public void setName(String name) {
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	void info (String name, int level, int korean, int english, int math) {
		setName(name);
		setLevel(level);
		setKorean(korean);
		setEnglish(english);
		setMath(math);

	}
	
	void print() {
		System.out.println("이름:"+name);
		System.out.println("학년:"+level);
		System.out.println("국어:"+korean);
		System.out.println("영어:"+english);
		System.out.println("수학:"+math);
		
		int total = korean + english + math;
		double average = total / 3.0;
		
		System.out.println("총점"+total);
		System.out.println("평균"+average);
	}
}
