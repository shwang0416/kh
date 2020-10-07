package loop;

public class Five {

	public static void main(String[] args) {
		
		//1부터 99사이에있는 5가 들어있는 숫자를 화면에 출력
		
		for(int i = 1; i < 100; i++) {
			if(i/10 == 5 || i%10 == 5)
				System.out.println(i);
		}
	}

}
