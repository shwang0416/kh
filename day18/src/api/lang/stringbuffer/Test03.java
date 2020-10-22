package api.lang.stringbuffer;

public class Test03 {
	public static void main(String[] args) {
		//StringBuffer대신 StringBuilder사용
		//StringBuilder가 더 빠르다.
		//그럼 왜 StringBuffer가 있을까.?
		
		//StringBuilder
		//동기화가 지원되지 않는다.
		// == 잠금장치가 없다.
		//그만큼 빠르나, 안전하지 못함(데이터손실 가능성)
		
		//StringBuffer
		//동기화가 지원된다.
		// == 잠금장치가 있다. 				// 보안없이 빠르게 atm기를 이용하기..
		//그만큼 느려지나, 안전함(데이터손실 없음)  // 불특정다수가 이용한다면 특히 중요
		
		//보통 보안은 필요하므로 StringBuffer를 더 많이 씀!!
		
		StringBuilder buffer = new StringBuilder();
		
		long a = System.currentTimeMillis();
		for(int i = 0; i< 10000000L; i++) {
			buffer.append("hello");	//hello를 더해라
			buffer.append("\n");	//\n을 덧붙여라
		}
		long b = System.currentTimeMillis();
		System.out.println(b-a+"ms"); //문자열로 바꿔서 출력해라
	}
}
