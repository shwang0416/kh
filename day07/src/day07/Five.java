package day07;

public class Five {

	public static void main(String[] args) {
		
		//1���� 99���̿��ִ� 5�� ����ִ� ���ڸ� ȭ�鿡 ���
		
		for(int i = 1; i < 100; i++) {
			if(i/5 == 10 || i/5 == 11 || i%10 == 5)
				System.out.println(i);
		}
	}

}