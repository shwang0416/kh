package loop;

public class Test12 {

	public static void main(String[] args) {
		/*	첫 날 돈을 seed원을 입금하고, 이후 매일 두 배의 돈을 입금한다면
			days일 뒤에 예금된 돈(deposit)은 얼마일까?
		*/
		int day = 1;
		int days = 40;
		long seed = 1L;
		long deposit = 0L;
		
		for(; day<=days;day++) {
			deposit += seed;
//			System.out.println(day+"일 차 입금: "+seed
//				+"원,"+"	현재 예금 :"+deposit+" 원");
			seed *= 2;
		}
		System.out.println(days+"일차 예금 :"+deposit+" 원");
	}

}
