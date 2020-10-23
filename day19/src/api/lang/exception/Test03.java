package api.lang.exception;

import java.util.Scanner;

public class Test03 {
	// 예외를 통합해서 처리하는 방법
		// - 다형성
		// - 만약 두 예외의 부모클래스가 같다면 통합이 가능하지 않을까?
		// - 업캐스팅(up-casting)
	
	//API검색결과 둘 다 java.lang.RuntimeException를 조상으로 뒀다.
		public static void main(String[] args) {
			
			try { //감시블록 						
				Scanner scan = new Scanner(System.in);
				System.out.println("사과 개수를 입력하세요");
				int apple = scan.nextInt();
				System.out.println("인원수를 입력하세요");
				int people = scan.nextInt();
				
				System.out.println("한사람당 사과를 "+apple/people+"개씩 먹을 수 있어요.");
				System.out.println("사과는 "+ apple%people+"개가 남아요.");
			}
			//java.lang.Exception : 모든 에러의 조상클래스
			catch(Exception e) { // 보통 통합처리는 이걸로 	=>	업캐스팅!
				System.err.println("오류 발생!");
			}
			/*
			 * Throwable을 상속하는 두 클래스: Error && Exception
			 * 
			 * 에러는 내 코드안에서 발생한 문제기 때문에 처리해버리면 안됨..!
			 * 그래서 Throwable로 통합처리하면 안되는 것.
			 */

//			catch(RuntimeException e) {// 통합처리!
//				System.err.println("오류 발생!");
//			}

		}


}
