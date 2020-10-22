package api.lang.stringbuffer;

public class Test02 {

	public static void main(String[] args) {
		//StringBuffer를 사용하여 덧셈을 진행
		long a = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer(); //비어있는공간생성
		
		for(int i = 0; i< 10000000L; i++) {
			buffer.append("hello");	//hello를 더해라
			buffer.append("\n");	//\n을 덧붙여라
		}
		long b = System.currentTimeMillis();
		System.out.println(b-a+"ms"); //문자열로 바꿔서 출력해라
	}

}
