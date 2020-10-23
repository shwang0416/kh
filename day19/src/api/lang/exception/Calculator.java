package api.lang.exception;

public class Calculator {
	/*
	 * div(10,0)을 실행했더니 다음과 같은 오류가 발생
	 * 
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		at api.lang.exception.Calculator.div(Calculator.java:7)
		at api.lang.exception.Test05.main(Test05.java:6)
		
		Q. 둘 중 어느 클래스에 try/catch를 써야할까??
	 */
	/*
	 *	- 나누기 기능은 오류가 발생할 가능성이 있다
	 *	- 불완전한 메소드(100% 실행보장X)
	 *	- 저는 불완전한 메시지에요 라고 표시
	 *		throws Exception
	 *
	 *	붙이면 이런 메시지가 뜨는데
	 *	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Unhandled exception type Exception
			at api.lang.exception.Test05.main(Test05.java:6)
			
			예외처리를 해달라는 뜻. 안하면 에러다.
			그러면 얘한테만 예외처리를 해주면 된다.
			=> 예외 몰아주기(throws)
	 */

	//나누기
	public static int div(int a, int b) throws Exception{
		return a / b;
	}

}
