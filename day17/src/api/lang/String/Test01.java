package api.lang.String;

public class Test01 {
/*
 * (1) 다음 값을 가지는 문자열 객체를 생성자를 이용하여 a,b라는 이름으로 만들어보세요
 * - Hello java
 * - hello java
 * 
 * (2) a와 b가 같은지 확인하여 결과를 true/false로 출력하세요
 * (3) a와 b가 대소문자를 무시하고 비교하여 같은지 확인하여 결과를 true/false로 출력하세요
 * (4) a가 Hello로 시작하는지 확인하여 true/false로 출력
 * (5) b가 java로 끝나는지 확인하여 true/false로 출력
 * (6) a와 b의 글자수를 구하여 화면에 출력 
 */
	public static void main(String[] args) {
		//(1)
		String a = new String("Hello java");
		String b = new String("hello java");
		
		//(2)
		System.out.println("(2).");
		System.out.println(a.equals(b));
		//(3)
		System.out.println("(3).");
		System.out.println(a.equalsIgnoreCase(b));
		//(4)
		System.out.println("(4).");
		System.out.println(a.startsWith("Hello"));
		//(5)
		System.out.println("(5).");
		System.out.println(b.endsWith("java"));
		//(6)
		System.out.println("(6).");
		System.out.println("a의 글자수: "+a.length());
		System.out.println("b의 글자수: "+a.length());
	}
	
}
