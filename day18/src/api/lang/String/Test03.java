package api.lang.String;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * <포함검사>
		 * - contains() : 단순하게 포함되었는지 아닌지 확인
		 * - index0f() / lastIndex0f() : 포함된 위치를 알 수 있음
		 */
		String word = ".";
		int done = 0;
		int flag = -1;
		String test = "https://redgolems.tistory.com/23";
		while(true) {
			flag = test.indexOf(word,done);
			if(flag < 0) {
				break;
			}
			System.out.println(word+"의 index "+flag);
			done = flag + 1;
			flag = -1;
		}
	}
}
