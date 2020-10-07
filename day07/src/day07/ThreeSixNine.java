package day07;

public class ThreeSixNine {

	public static void main(String[] args) {
		//문제: 1부터 99사이에 있는 3,6,9 게임에서 박수치는 숫자를 구하여 출력
		
		/*
			응용: 1부터 input사이에 있는 num1,num2,num3 게임에서 박수치는 숫자를 구하여 출력
				num1, num2, num3은  0~9사이의 자연수
		*/
		
		int input = 990;
		int dec = 10;
		
		int num1 = 3;
		int num2 = 6;
		int num3 = 9;
	
		for(int i = 1; i <= input; i++) {
			if(i == dec*10 && dec <= input/10) 					// i의 자릿수와 dec의 자릿수 맞춤. (i가 32이면 dec은 10, i가 452이면 dec은 100...)
				dec *= 10;
			
/*			if((i >= num1*dec && i < (num1+1)*dec) 
					|| (i >= num2*dec && i < (num2+1)*dec) 
					|| (i >= num3*dec && i < (num3+1)*dec)) { 	// 가장 윗자리수가 num1, num2, num3인지 체크
				System.out.println(i+": 짝!");
				continue;
			}
*/
			for(int ten = 10;ten <= dec;ten*=10) {
				if(i%ten == num1 || i%ten == num2 || i%ten == num3
					|| i/ten%10 == num1 || i/ten%10 == num2 || i/ten%10 ==num3) {
					System.out.println(i+": 짝!");
					break;
				}
			}
		
		}
	}

}
