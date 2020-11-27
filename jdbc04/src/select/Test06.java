package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * 그룹 조회
		 */
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			String sql ="select gender, count(*) CNT from person group by gender";
//										count(*)에 별칭 붙이기
			PreparedStatement ps =con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); //select할때는 무조건 executeQuery (외우기)
			
			while(rs.next()) {
				System.out.println(rs.getString("gender"));
				System.out.println(rs.getInt("cnt"));//별칭으로 꺼낸다!
			}
			
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
