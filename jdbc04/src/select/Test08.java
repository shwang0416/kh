package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test08 {
	public static void main(String[] args) {
		/*
		 * select count(*) from person을 자바에서 실행한 뒤 결과출력
		 */

		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			String sql ="select count(*) CNT from person";
			PreparedStatement ps = con.prepareStatement(sql);
//			주의: count(*) 처럼 숫자 하나만 나오는 경우라도 결과집합을 사용한다.
//					( count는 무조건 결과가 1개 나온다!! => while문 필요X)
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt("CNT"));
			
//			int result = ps.executeUpdate();  => 이러면 count값이 나오지 않는다...
//			System.out.println(result);
			con.close();
			

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
