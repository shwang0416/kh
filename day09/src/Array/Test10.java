package Array;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		/*
		 * Test10
			[10, 20, 30, 40, 50] 이 저장된 배열을 만들고 다음과 같이 위치를 변경하도록 구현

			배열을 오른쪽으로 1칸 회전시켜 출력하세요(결과 : 50, 10, 20, 30, 40)
			(선택) 사용자가 입력한 칸수만큼 배열을 회전시키도록 구현
		 */
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[] {10, 20, 30, 40, 50};
		int temp = 0; 
		System.out.println("몇 번 회전시킬지 입력하시오(숫자만) :");
		
		int num = scan.nextInt(); 					//회전 수 받기
		
		for(int j = 0; j < num; j++) { 				//num번 회전
			for(int i = 0; i < arr.length; i++) {	
				if(i == 0) {						//배열 첫번째 데이터 temp에 저장
					temp = arr[0];
					continue;
				}
				arr[i-1] = arr[i];					//나머지 데이터 한칸씩 회전
			}
			arr[arr.length-1] = temp;				//첫번째 데이터를 맨 뒤에 저장
		}
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
