package loop;

public class Test11 {

	public static void main(String[] args) {
		int once = 10;
		int days = 30;
		int result = 0;
		
		for(int day = 1; day <= days; day++) {
			result += once;
			System.out.println(day+"일 푸시업 "+once+" 개");
			once += 3;
		}
		System.out.println(days+"간 한 푸시업 총"+result+"개");
	}

}
