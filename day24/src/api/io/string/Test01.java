package api.io.string;

import java.util.Arrays;

public class Test01 {
	/*
	 * 문자열 입출력
	 *  - 문자열도 객체이지만 특별한 이유?
	 *  - 문자열은 byte[] 와 호환이 된다. : .getBytes() 명령 사용
	 *  - 자체적으로 변환이 되므로 분해할 필요가 없다.
	 */
	public static void main(String[] args) {
		
		String hello = "안녕하세요!";
		byte[] data = hello.getBytes();
		//String -> byte[]
		
		System.out.println(hello);
		System.out.println(Arrays.toString(data));
		//UTF-8 (초중종성으로 한글입력)
			
		String recover = new String(data); //byte[] -> String
		System.out.println(recover);
	}
}
