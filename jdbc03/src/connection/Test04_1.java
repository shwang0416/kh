package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		
//		1. 준비
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
//			2. 연결
			Connection con;
		
				con = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:xe","web","web");

			
//			3. 처리 및 전송
			Scanner sc = new Scanner(System.in);
			String input [] = {"아이디", "패스워드", "닉네임", "생일"};
			//		(no, id, pw, nick, birth, auth, point, join)
			//		(seq, ? , ? , ? , ? , ? , ? , sysdate) 
			String sql = "insert into member values(member_seq.nextVal,?,?,?,?,'일반',0,sysdate)";
			PreparedStatement ps = con.prepareStatement(sql);
		
			for(int i=0; i < input.length; i++) {
				System.out.println(input[i]+" 입력해");
				ps.setString(i+1, sc.nextLine());
			}
			ps.execute();
				
			//		4. 종료
			sc.close();
			con.close();
		} catch (SQLIntegrityConstraintViolationException e) {
//			SQLIntegrityConstraintViolationException : 아이디/닉네임 중복
			System.err.println("아이디/닉네임이 이미 사용 중입니다.");
		}
		catch (Exception e) {
			System.err.println("데이터베이스 오류!");
		}
		


		
	}
}
