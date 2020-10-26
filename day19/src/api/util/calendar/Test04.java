package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04 {
/*
 * 2020 크리스마스에 사귄 지 100일이 되려면 몇 일부터 사귀기 시작해야 하는지 계산&&출력
 * (D-Day 계산기)
 */
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2020, 11, 25); 
		// ※ MONTH를 설정할 때는 -1
		// Calendar, Date등 옛날에 만들어진 클래스에선 0~11을 개월로 쓰고 12를 전체 개월수를 나타내는 상수로 썼다.
		
		c.add(Calendar.DATE, -99); 
		// ※ d-99 98 ... d-0까지 총 100일임.
		
		
		//출력
		Date d = c.getTime();
		//Date로 변환
		SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
		//SimpleDateFormat 객체 생성
		System.out.println(f.format(d));
		//format객체 f형으로 d의 내용 출력
	}
}
