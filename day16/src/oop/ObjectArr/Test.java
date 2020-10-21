package oop.ObjectArr;

public class Test {

	/*
	 * 1. 다음과 같은 정보를 배열을 만들어 저장하고, 정보를 출력해보세요
		정보에는 총점과 합계가 같이 출력되도록 해보세요

	- 이름 : 이오리 , 자바점수 : 80점 , JSP점수 : 70점
	- 이름 : 김갑환 , 자바점수 : 70점 , JSP점수 : 90점
	- 이름 : 최번개 , 자바점수 : 100점 , JSP점수 : 45점
	 */
	public static void main(String[] args) {
		
		ExtraQuestion01 [] arr = new ExtraQuestion01 [3];
		arr[0] = new ExtraQuestion01("이오리",80,70);
		arr[1] = new ExtraQuestion01("김갑환",70,90);
		arr[2] = new ExtraQuestion01("최번개", 100, 45);
		
		int totalJava = 0, totalJSP = 0;
		double averJava = 0, averJSP = 0;
		
		for(int i = 0; i < arr.length; i++) {
			totalJava += arr[i].getScoreJava();
			totalJSP += arr[i].getScoreJSP();
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getScoreJava());
			System.out.println(arr[i].getScoreJSP());
		}
		averJava = totalJava / (double)arr.length;
		averJSP = totalJSP / (double)arr.length;
		System.out.println("java 합계 :" + totalJava);
		System.out.println("java 평균 :"+averJava);
		System.out.println("JSP 합계 :"+totalJSP);
		System.out.println("JSP 평균 :"+averJSP);
		
	}
}
