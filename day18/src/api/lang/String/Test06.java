package api.lang.String;

import java. util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String first, second = "", c1, c2; 
		//첫 번째 단어, 두 번째 단어, 첫 번째단어_마지막 글자, 두 번째단어_첫 번째 글자
		//ex) 바나나, 나훈아, 나, 나
		
		int choice ,level = 3;		//종료선택지, 글자 수
		
		//입력받은 단어 검사
		boolean isLevel;			//글자 수가 맞는지
		boolean isUnconnected;		//연속된 하나의 단어인지
		first = "바나나";
		
		while(true) {
			System.out.println("쿵쿵따리 쿵쿵따 쿵쿵따리 쿵쿵따");
			System.out.println(first+"!");
			System.out.println("("+first+" 뒤에 올 단어는?): ");
			System.out.println("("+level+" 글자 단어만 가능)");
			second = scan.nextLine();
			//입력받은 단어 검사
			isLevel = (second.length()==level); 		//글자 수가 맞는지
			isUnconnected = second.trim().contains(" ");//연속된 하나의 단어인지
			
			
			
			//단어가 잘못됐으면
			if(!isLevel || isUnconnected) {				
				System.out.println(level+"글자 단어를 입력해야 돼!");
				printDot();
				continue;
			}
			//연속된 3글자 단어라면
			//두 글자가 같은지 검사
			c1 = first.substring(first.length()-1); //첫 번째단어_마지막글자
			c2 = second.substring(0,1); // 두 번째단어_첫번째 글자
			
			if(c1.equals(c2)) {
				System.out.println("성공!\n");		//쿵쿵따 성공
				first = second;
				continue;
			}
			else {									//쿵쿵따 실패
				System.out.println("실패....");
				printDot();
				System.out.println("게임을 종료할래?\n");
				while(true) {
					System.out.println("1.종료 2.재도전(숫자만 입력하세요)");
					choice = scan.nextInt();
					scan.nextLine();
					
					if(choice == 1) {
						System.out.println("안녕~~");
						return;
						
					}
					else if (choice == 2) {
						break;
					}
					else {
						System.out.println("숫자를 잘못 입력했어");
						printDot();
						continue;
					}
				}
				continue;
			}
		}
		
	}
	public static void printDot() {
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
	}

}
