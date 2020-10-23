package api.util.date;

import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//java.util.Date 클래스
		// - 생성자중에 비추천(Deprecated)가 많다
		// - 이유는 Y2K (밀레니엄 버그)
		
		
		//기본 생성자를 이용하면 "현재시간"을 가져온다.
		Date a =new Date();//java.util을 골라야한다.
		System.out.println(a);//a.toString()
		//Fri Oct 23 19:42:26 KST 2020
	
		//연월일을 설정하는 생성자(비추천)
		// - 비추천은 경고와 함께 가운데 줄이 그어진다.
		Date b = new Date(2020,10,23);
		System.out.println(b);
		//Tue Nov 23 00:00:00 KST 3920
		//기본베이스가 1900이라 +1900더해짐, 달+1됨...
		//여러 가지 문제점으로 앞으로는 쓰지 말 것을 권장(단종 가능성 있음)
		
		//문제점: 시간 형식이 한국 정서에 맞지 않는다.
		//해결책: 시간 형식을 설정하는 클래스를 찾아서 사용한다.(내가직접X)
	}
}
