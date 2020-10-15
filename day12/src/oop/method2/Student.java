package oop.method2;

public class Student {
	String name;
	int score;
	
	//초기화 메소드를 변수 하나당 하나씩 생성 - Setter 메소드
	// - name을 설정하는 메소드라면 이름이 setName이다. (합성어 작명규칙)
	
	void setName(String name) {
		this.name = name;
	}
	
	void setScore(int score) {
		if(score >= 0 && score <= 100) //this.score변수에 저장 가능한 범위 지정 
			this.score = score;
	}
}
