package select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JdbcUtil;

public class Test10 {
	public static void main(String[] args) {
		
		//미리 만들어둔 메소드를 불러서 연결을 생성한다
		try {
			Connection con = JdbcUtil.getConnection();
			
			String sql = "select * from person";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				System.out.println(rs.getString("person_name"));
			}
			//rs.close();
			//ps.close();
//			con을 닫으면 자동으로 닫힘 (=>생략)
			con.close();
		}
		catch(Exception e) {
			
		}
	}
}
