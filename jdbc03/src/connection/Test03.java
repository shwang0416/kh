package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1. 준비
		Class.forName("oracle.jdbc.OracleDriver");
		
//		2. 연결
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
//		3. 처리 및 전송
		Scanner sc =new Scanner(System.in);
		String [] quest = {"이름", "자바점수", "DB점수", "성별"};
		List <String> input = new ArrayList <>();
		String sql = "insert into person values(person_seq.nextVal,?,?,?,?,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);

		for(int i =0;i < quest.length;i++) {
			System.out.println(quest[i]+"입력해");
			ps.setString(i+1,sc.nextLine()); //원래 자료형이 String은 아니므로 이렇게 넣으면 안된다!
		}
		ps.execute();
		
//		4. close
		sc.close();
		ps.close();
		System.out.println("입력 완료");
	}
}
