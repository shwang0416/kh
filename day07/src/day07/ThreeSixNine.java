package day07;

public class ThreeSixNine {

	public static void main(String[] args) {
		//����: 1���� 99���̿� �ִ� 3,6,9 ���ӿ��� �ڼ�ġ�� ���ڸ� ���Ͽ� ���
		
		/*
			����: 1���� input���̿� �ִ� num1,num2,num3 ���ӿ��� �ڼ�ġ�� ���ڸ� ���Ͽ� ���
				num1, num2, num3��  0~9������ �ڿ���
		*/
		
		int input = 990;
		int dec = 10;
		
		int num1 = 3;
		int num2 = 6;
		int num3 = 9;
	
		for(int i = 1; i <= input; i++) {
			if(i == dec*10 && dec <= input/10) 					// i�� �ڸ����� dec�� �ڸ��� ����. (i�� 32�̸� dec�� 10, i�� 452�̸� dec�� 100...)
				dec *= 10;
			
/*			if((i >= num1*dec && i < (num1+1)*dec) 
					|| (i >= num2*dec && i < (num2+1)*dec) 
					|| (i >= num3*dec && i < (num3+1)*dec)) { 	// ���� ���ڸ����� num1, num2, num3���� üũ
				System.out.println(i+": ¦!");
				continue;
			}
*/
			for(int ten = 10;ten <= dec;ten*=10) {
				if(i%ten == num1 || i%ten == num2 || i%ten == num3
					|| i/ten%10 == num1 || i/ten%10 == num2 || i/ten%10 ==num3) {
					System.out.println(i+": ¦!");
					break;
				}
			}
		
		}
	}

}
