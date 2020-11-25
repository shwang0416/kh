package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. 준비
		Class.forName("oracle.jdbc.OracleDriver"); 
		
		//2. 연결
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		
//		SQL 명령을 준비하여 실행하도록 코드를 작성
//		※ 세미콜론 금지(자바가 대신 찍어줌)
		String sql = "create sequence java_seq";
		PreparedStatement ps = con.prepareStatement(sql);//전송도구
		// 종이비행기 생성완료
		ps.execute(); //발사
		
		//3. 종료
		con.close();
		System.out.println("완료!");
	}
}
