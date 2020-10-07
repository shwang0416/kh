package loop;

public class Test12 {

	public static void main(String[] args) {
		int day = 1;
		int days = 30;
		long seed = 1;
		long deposit = 0;
		
		for(; day<=days;day++) {
			deposit += seed;
			System.out.println(day+"일 차 입금: "+seed
					+"원,"+"	현재 예금 :"+deposit+" 원");
			seed *= 2;
		}
	}

}
