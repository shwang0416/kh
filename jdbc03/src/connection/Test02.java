package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1.준비
		Class.forName("oracle.jdbc.OracleDriver");
//		2.연결
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
//		3.명령 준비 및 전송
//			동적 SQL 처리 방식
//			=> PreparedStatement에 존재하는 "값 채우기 기능"을 이용하여 변조된 값을 삽입
//			=> 특수문자 오류 발생 가능, SQL 인젝션 공격 가능(보안 문제 발생 가능성)
		String person_name = "테'스'트";
		String sql = "insert into person values(person_seq.nextval, ?, 100, 99, '여자', sysdate)";
		PreparedStatement ps = con.prepareStatement(sql); //전송도구
		
//		ps에게 1번째 물음표에 person_name을 String 형태로 알아서 채워달라고 부탁
		ps.setString(1, person_name);
		
		ps.execute();
		System.out.println("보내기성공!");
		// 커밋을 안해도 기본적으로 자동커밋이 되도록 설정되어 있다.
		// - 수동 커밋으로 변경하면 내가 직접 커밋을 실행할 수 있다.
		
//		4.종료
		con.close();
	}
}
