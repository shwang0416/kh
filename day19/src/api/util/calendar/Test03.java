package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	/*
	 * 날짜 계산기능
	 * 
	 * Q. 열흘 뒤가 몇 일이지??
	 * 
	 * 1.현재 날짜를 구한다.
	 * 2. + 10
	 * 3. 출력한다.
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
//		날짜가 넘어가는 것을 신경쓰지 않아도 알아서 변환해 줌
//		c.add(날짜, 10일);
		c.add(Calendar.DATE, 10); // 날짜를 +10;
		
		//출력
		Date d= c.getTime();
		SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(d));
	}

}
