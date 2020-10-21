package api.lang.object;

public class Test03 {

	public static void main(String[] args) {
		Student st = new Student();
		
		//Student 클래스에는 아무 기능도 없지만 Object의 메소드 사용가능
		int v = st.hashCode();
		String s = st.toString();
		
		System.out.println(v);
		System.out.println(s);
	}
}
