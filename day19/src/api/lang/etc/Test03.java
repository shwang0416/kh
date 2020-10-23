package api.lang.etc;

public class Test03 {

	public static void main(String[] args) {
		//java.lang.Runtime 클래스
		// - 생성자가 없음(static도 없음. 의도적으로 잠굼)
		// - 만든 사람이 원하는 방식으로 생성이 되게 유도하는 것
		// - 생성 명령이 존재함(static)
		
		Runtime run = Runtime.getRuntime();
		
		//exec() : 외부 명령을 실행(운영체제마다 명령이 다름)
		run.exec("notepad.exe");
		
	}

}
