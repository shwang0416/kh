package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test09 {
	public static void main(String[] args) {
		/*
		 * 사용자가 원하는 구간의 등수를 입력하면 해당하는 순위의 데이터들을 조회하여 출력(총점 순)
		 * 
		 * ex) 3, 7 => 3등부터 7등까지 조회
		 * 
		 * TOP rank()
		 */

		/*
		 * [top n]
		 * select * from rownum rn, TMP.* from (
		 * select * from person order by javascore+dbscore desc )TMP
			) where rn between ? and ?";
		 * [top rank]
		 * select * from ( select person_name, javascore+dbscore, rank() over(order by
		 * javascore+dbscore desc)score from person) where score between 1 and 6;
		 */
		int n1 = 1;
		int n2 = 5;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

			String sql = "select * from (select person_name, javascore+dbscore, "
					+ "rank() over(order by javascore+dbscore desc)score from person) "
					+ "where score between ? and ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, n1);
			ps.setInt(2, n2);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("person_name")+"/");
				System.out.print(rs.getInt("javascore+dbscore")+"/");
				System.out.println(rs.getInt("score")+"/");
			}
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
