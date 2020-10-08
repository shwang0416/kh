package loop2;

public class Test {

	public static void main(String[] args) {
		// 달팽이 = user
		// 낮에는 3cm 밤에는 2.5cm // 15cm 올라가는데 몇 일이 걸릴까? (day)

		float user = 0;
		int day = 1;
		while (true) {

			user += 3;
			if (user == 15) {
				break;
			}
			user -= 2.5;
 			day++;
		}
		System.out.println("15cm 올라가는데 걸린 날짜 : " + day + "일");

	}

}
