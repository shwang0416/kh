package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//시간을 내가 원하는 형식으로 출력하는 방법
		Date a = new Date(); 
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String time = f.format(a);
		System.out.println(time);
	}
	
}
