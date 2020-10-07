package loop2;

public class Test05 {

	public static void main(String[] args) {
		/*
		 * 달팽이가 나무에 올라가려고 합니다.
		 * 낮에는 3cm올라가고 밤에는 2.5cm내려갑니다.
		 * 나무의 높이가 15cm라고 할 때 나무에 올라가려면 며칠이 걸릴까요?
		 */
		int tree = 15;
		double day = 3;
		double night = 2.5;
		double point = 0;
		int date = 0;
		while(true) {
			date++;
			point+=day;
			System.out.println(date+"일 째: 낮"+point);
			if(point >= tree)
				break;
			point-=night;
			System.out.println(date+"일 째: 밤"+point);
		}
		System.out.println(date+"일 째에 등반성공!");
		
	}

}
