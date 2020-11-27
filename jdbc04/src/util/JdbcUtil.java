package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 데이터베이스에서 발생하는 중복코드를 간소화
 * 
 */
//연결 생성 메소드(getConnection)
public class JdbcUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		return con;
	}
}
