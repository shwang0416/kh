package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	/*
	 * execute() : 실행만 하는 명령
	 * executeUpdate() : 실행 후 성공한 행의 개수를 반환(INSERT, UPDATE, DELETE)
	 * executeQuery() : 실행 후 결과집합을 반환(SELECT)
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"system","oracle");
			
			String sql = "update product set product_quantity "
					+ "= product_quantity + 1 where product_no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("제품번호입력: ");
			int num = sc.nextInt();
			ps.setInt(1,num);
			int result = ps.executeUpdate();
			
			sc.close();
			con.close();
			
			System.out.println("result : "+ result);
			if(result > 0) { 
				System.out.println("수정 성공");
			}
			else {
				System.out.println("대상이 없습니다.");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("에러 발생!");
			e.printStackTrace();
		}
	}
}
