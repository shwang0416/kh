package jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test05_1 {
	public static void main(String[] args) {
		/*
		 * 검색어와 "유사한 이름"을 가지는 데이터를 조회
		 *  - LIKE%
		 *  - INSTR()
		 */
		
		String keyword ="왕";
		
//		select * from person where instr(person_name, '왕') > 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			String sql ="select * from person where person_name like ?";
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, "%"+keyword+"%");
			ResultSet rs = ps.executeQuery(); //select할때는 무조건 executeQuery (외우기)
			
			while(rs.next()) {
				System.out.print(rs.getInt("person_no")+"/");
				System.out.print(rs.getString("person_name")+"/");
				System.out.print(rs.getInt("javascore")+"/");
				System.out.print(rs.getInt("dbscore")+"/");
				System.out.print(rs.getString("gender")+"/");
				System.out.print(rs.getString("regist_date")+"\n");
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
