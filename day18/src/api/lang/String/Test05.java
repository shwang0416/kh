package api.lang.String;

public class Test05 {
	public static void main(String[] args) {
		/*
		 *	문자열 편집기능
		 *	- 대문자 -> 소문자 : toLowerCase
		 *	- 소문자 -> 대문자 : toUpperCase
		 */
		String address = "https://redgolems.tistory.com/23";
		System.out.println(address);
		System.out.println(address.toUpperCase());
		
		//불필요한 여백 제거(앞/뒤만 가능. 글자 사이 안 됨)
		//입력창, 통신에서 유용하게 사용가능
		String address2 = "       https://redgolems.tistory.com/23     ";
		System.out.println(address2);
		System.out.println(address2.trim().toLowerCase());
		
		//문자열 자르기
		String name = "김애플";
		System.out.println(name);
		String firstname= name.substring(1); //이름. 1부터 마지막까지
		String lastname= name.substring(0, 1); //성. 0부터 1까지
		System.out.println("성:"+lastname);
		System.out.println("이름:"+firstname);
	}
}
