package api.lang.stringbuffer;


//java.lang.StringBuffer : 문자열 합성기
public class Test01 {
	public static void main(String[] args) {
		//String의 문제점 : 덧셈
		
		String str = "";
		long a = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)	{
			str += "hello";
			str += "\n";
		}
		long b = System.currentTimeMillis();
		System.out.println(b-a+"ms");
		//이걸 엄청 많이 반복하면 상상도못하게 계산속도가 느려짐.. like 백만번
		//String은 네왜 그렇게 오래걸릴까?
	}

}
