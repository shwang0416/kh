package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
		//java.lang.System 클래스
		// - 생성자가 없음(+ static method: 편하게 사용하도록)
		
		//표준 출력 : System.out
		System.out.println("안녕");
		
		//표준 에러 : System.err
		System.err.println("안녕");
		
		//표준 입력 : System.in + Scanner
		
		//운영체제의 시간 정보 불러오기
		// - 프로그래밍에서는 기준시라 불리는 시간이 있다
		// - currentTimeMillis() 는 기준시로부터 흐른 총 밀리초를 반환한다.
		// - 1970년 1월 1일부터 ~~~밀리초가 지난 상태이다
		// - /60(=> 분), /60(=> 시), /24(일), /365(년)으로 날짜 계산가능함
		
		// - 원래 저번에 쓴 것처럼 코드가 실행된 a시점시간과 b시점시간을 빼서 비교하려고 만든 것
		
		long time = System.currentTimeMillis();
		System.out.println("time = "+ time);
		
		//프로그램 종료
		//System.exit(0);
		System.out.println("hello"); //절대 출력될 수 없는 메시지.
		
		
		//자바의 단점 운영체제의 기능을 많이 이용할 수 없다.
		//윈도우랑 친한언어: c언어
		//대신 독립적이라 어느 운영체제에서도 이용가능
		//=> 자바에서도 운영체제를 어느정도는 이용할 수 있도록 만든 클래스가 System 클래스
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("os.name")); //os.name(이게 key)에 연결된 value를 불러와라
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.library.path"));
	
	}
}
