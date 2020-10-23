package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
		//Q : Calendar는 Date와 호환이 가능할까?
		// - Date가 출력은 빠르고 편하다
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		//정보설정 : .set(항목, 값);
		
		//1. 연도를 2021년으로 변경
		c.set(Calendar.YEAR, 2021);
		//2. 월을 5월로 변경
		c.set(Calendar.MONTH, 5-1); //달 설정할 때는 꼭 -1 (꺼낼때는 +1)
		//3. 일을 3일로 변경
		c.set(Calendar.DATE, 3);
		//사실 한번에도 가능.
		c.set(2021,4,3);
		
		Date d= c.getTime();
		SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(d));
	}
}
