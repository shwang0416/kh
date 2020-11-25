package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. 준비
		Class.forName("oracle.jdbc.OracleDriver"); 
		
		//2. 연결
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		
		//3. 종료
		con.close();
		System.out.println("완료!");
	}
}
