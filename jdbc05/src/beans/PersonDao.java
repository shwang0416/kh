package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JdbcUtil;

public class PersonDao {
	
		
		//등록 메소드
		public void insert(String person_name, int javascore, int dbscore, String gender) throws SQLException, ClassNotFoundException {
			Connection con = JdbcUtil.getConnection();
			String sql = "insert into person values(person_seq.nextval, ?, ?, ?, ?, sysdate)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, person_name);
			ps.setInt(2, javascore);
			ps.setInt(3, dbscore);
			ps.setString(4, gender);
			ps.execute();
//			ps.executeUpdate(); //결과가 궁금하면
			con.close();
		}
		//등록 메소드 (한 덩어리로 등록)
		public void insert(PersonDto dto) throws SQLException, ClassNotFoundException {
			Connection con = JdbcUtil.getConnection();
			String sql = "insert into person values(person_seq.nextval, ?, ?, ?, ?, sysdate)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPerson_name());
			ps.setInt(2, dto.getJavascore());
			ps.setInt(3, dto.getDbscore());
			ps.setString(4, dto.getGender());
			ps.execute();
//			ps.executeUpdate(); //결과가 궁금하면
			con.close();
		}
}
