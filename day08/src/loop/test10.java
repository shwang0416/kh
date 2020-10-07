package loop;

public class test10 {

	public static void main(String[] args) {
		//하루에 7700원씩 모으면 1년에 얼마나 모을 수 있을까?
		
		int once = 7700;
		int days = 365;
		int deposit =0;
		
		for(int day = 1; day <= days; day++) {
			deposit += once;
		}
		System.out.println(days+"일 동안 모은 돈 "+deposit+" 원");
	}

}
