package loop;

public class ThreeSixNine {

	public static void main(String[] args) {
		//문제: 1부터 99사이에 있는 3,6,9 게임에서 박수치는 숫자를 구하여 출력
		
		/*
			응용: 1부터 input사이에 있는 num1,num2,num3 게임에서 박수치는 숫자를 구하여 출력
				 num1, num2, num3은  0~9사이의 자연수
		*/ 
		final int ten = 10;
		int input = 369;
		
		int num1 = 3;
		int num2 = 6;
		int num3 = 9;
		
		int temp;
		
		for(int i = 1; i <= input; i++) {
			
			System.out.print(i);
			temp = i;
			while(temp > 0) {
				if(temp%ten == num1 || temp%ten == num2 || temp%ten == num3)
					System.out.printf(" 짝!");
				temp /= ten;
			}
			System.out.println("");
		}
	}

}
