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
		c.add(Calendar.DATE, -100);
		
		
		//출력
		Date d= c.getTime();
		SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(d));
	}
}
