package api.util.Scanner;

import java.util.Scanner; 

public class Test02 {
	public static void main(String[] args) {
		String str = "이 편지는 200년전 영국에서 시작된 편지로...";
		
		Scanner sc = new Scanner(str);//str 문자열을 읽겠다!
		
		//.hasNextLine() : 
		//.nextLine() : \n바로 직전까지 읽고 \n을 버리는 명령(한줄,문장)
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		//다썼으면 close
		sc.close();
	}
}
