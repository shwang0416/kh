package api.util.calendar;

import java.util.Calendar;

public class Test01 {	//java.util.Calendar 클래스
						// - 추상클래스
						// - 객체 생성 불가
						// => 인스턴스 생성명령 getInstance()
	
//Date의 단점을 보완하기 위해 나온 클래스.
	//일반적으로 사용 중인 그레고리력 사용.
	
	public static void main(String[] args) {
//		Calendar c1 = new Calendar();
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		
//		1. 설정: .set(항목, 값);
//		2. 반환: .get(항목);
//		- YEAR : 연도
//		- MONTH: 월(Calendar에서 월은 0부터 11까지로 설정한다 	=> 꺼낼 때 + 1 설정할 때 -1 )
		
		int year = c1.get(Calendar.YEAR);	
		System.out.println(year);	
		
		
		int month = c1.get(Calendar.MONTH);	
		System.out.println(month);	
		
		
		int date = c1.get(Calendar.DATE);	
		int dayOfMonth = c1.get(Calendar.DAY_OF_MONTH);	
		System.out.println(date);
		
		
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		
		int second = c1.get(Calendar.SECOND);
		System.out.println(second);
		
		//근데 이렇게 하나하나 뽑아쓰면 객체지향도 아니고 힘들다.. 
	}
}
