package oop.ObjectArr;

public class ExtraQuestion01 {
/*
 * 1. 다음과 같은 정보를 배열을 만들어 저장하고, 정보를 출력해보세요
	정보에는 총점과 합계가 같이 출력되도록 해보세요

- 이름 : 이오리 , 자바점수 : 80점 , JSP점수 : 70점
- 이름 : 김갑환 , 자바점수 : 70점 , JSP점수 : 90점
- 이름 : 최번개 , 자바점수 : 100점 , JSP점수 : 45점
 */
	String name;
	int scoreJava;
	int scoreJSP;
	
	public ExtraQuestion01(String name, int scoreJava, int scoreJSP) {
		setName(name);
		setScoreJava(scoreJava);
		setScoreJSP(scoreJSP);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreJSP() {
		return scoreJSP;
	}

	public void setScoreJSP(int scoreJSP) {
		this.scoreJSP = scoreJSP;
	}



}
