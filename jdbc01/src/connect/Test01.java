package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * JDBC(java DataBase Connectivity)
		 * Java에서 Database에 연결하기 위한 모든 형태의 작업
		 * 
		 * => Java에 'Oracle'에 연결할 것임을 알려줘야 함.
		 * => Oracle에서 제공하는 자바를 위한 라이브러리를 등록해야 함.
		 */
		
		/*
		 * 오라클에 연결하는 과정 [3단계]
		 * 
		 * 1. 연결 준비 (오라클에서 제공하는 도우미 호출)
		 * 2. 연결 실행 (로그인 => 아이디/비밀번호/ + 접속주소)
		 * 3. 연결 종료 (명령 실행)
		 */
	
//		1. 준비
//		Class.forName("클래스 경로");
//		Class.forName("oracle.jdbc.driver.OracleDriver"); //옛날 버전(deprecated)
		Class.forName("oracle.jdbc.OracleDriver");
//					oracle>jdbc패키지 안의 OracleDriver파일을 사용(도우미 파일)
		System.out.println("성공!");
	
//		2. 실행
//		DriverManager.getConnection(주소, 계정, 비밀번호);
	/*
	 * Connection con 변수를 만들어서 저장
	 * (안 만들어도 연결은 가능하나 뒤에서 다시 쓰기위해)
	 * jdbc:oracle:thin: 연결을 위해 사용되는 도구의 종류
	 * localhost : 데이터베이스의 접속 포트(Port)
	 * xe : 데이터베이스 SID(식별자)
	 * 
	 * ※만약 ORA로 시작하는 에러메시지가 출력된다면 오라클 에러
	 */
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"kh", "kh");
		System.out.println("로그인 성공!");
		
//		3. 종료
		con.close();
		System.out.println("로그아웃 성공!");
	}
}
