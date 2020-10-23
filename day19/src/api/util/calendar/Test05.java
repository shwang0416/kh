package api.util.calendar;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
/*
 * 사용자에게 연도와 월을 입력받아서 해당하는 달의 달력 출력해주세요.
 * - 달력은 무조건 6줄로 나와야 하며, 전 달과 다음 달이 나올 수 있습니다.
 * 이 문제를 풀려면 더하고 빼고 지지고 볶아야함,,,,,,
 * - 한 줄에 7개씩 탭 키로 간격을 벌려 출력
 * - 7개를 출력하면 개행을 해서 다음 줄에 다시 출력
 * - 힌트 : 요일을 계산해야 하는데, 요일에 해당하는 상수는 Calendar.DAY_OF_WEEK입니다
 * 
 * 
 * (네이버 캘린더 참고)
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		
		int year = 0, month = 0;
		int count = 0;
		int from = 1;
		
		//입력
		System.out.println("달력의 연도를 입력하세요: ");
		year = scan.nextInt();
		System.out.println("달력의 달을 입력하세요: ");
		month = scan.nextInt();
		c.set(year,month - 1,1); //month를 set할 때는 -1
		
		
		while(Calendar.DAY_OF_WEEK + from != Calendar.WEDNESDAY)
			from--;
		c.add(Calendar.DATE, from);	
		//달력표기 시작날짜 지정
		
		SimpleDateFormat f= new SimpleDateFormat("E	");
		Date d;
		for(int i = 0; i < 7; i++) {
			d = c.getTime();
			System.out.print(f.format(d));
			c.add(Calendar.DAY_OF_WEEK, +1);
		}
		c.add(Calendar.DAY_OF_WEEK, -7);
		//요일 표기
		
		f = new SimpleDateFormat("d	");
		for(int i = 0; i< 42; i++) {
			if(count%7 == 0)
				System.out.println(); 		//줄바꿈
			
			d = c.getTime();
			System.out.print(f.format(d)); 	//날짜 출력
			
			c.add(Calendar.DATE,+1);		//날짜+1
			count++;
		}	
	}
}
