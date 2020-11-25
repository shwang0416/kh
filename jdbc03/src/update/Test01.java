package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);

//		1. 준비
			int person_no = 1;
			int javascore = 50;
			int dbscore = 50;
			Class.forName("oracle.jdbc.OracleDriver");
//		2. 통로생성
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
//		3. 발사
			String sql = "update person set javascore = ?,dbscore = ? where person_no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, javascore);
			ps.setInt(2, dbscore);
			ps.setInt(3, person_no);
			ps.execute();			//잊지말고 써야함!!
			
//		4. 닫기
			sc.close();
			con.close();

	}
}
