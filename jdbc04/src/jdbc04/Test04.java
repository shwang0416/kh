package jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test04 {
	public static void main(String[] args) {
//		사용자에게 이름을 입력받아 해당하는 이름의 사람을 조회
		String person_name = "PI";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe"
					, "system","oracle");
			String sql = "select * from person where person_name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, person_name);
			
			ResultSet rs = ps.executeQuery();
//			데이터가 겹칠 수 있는지 없는지 파악하는 것이 중요
			
			int count = 0;
			
			while(rs.next()) {
				System.out.println(rs.getInt("person_no")+"/");
				System.out.println(rs.getString("person_name")+"/");
				System.out.println(rs.getInt("javascore")+"/");
				System.out.println(rs.getInt("dbscore")+"/");
				System.out.println(rs.getString("gender")+"/");
				System.out.println(rs.getString("regist_date")+"\n");
				count++;
			}
			
			if(count ==0) {
				System.out.println("검색 결과가 없습니다.");
			}
			else {
				System.out.println(count+" 개의 결과가 조회되었습니다.");
			}
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
