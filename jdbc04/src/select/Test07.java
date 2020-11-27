package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test07 {
	public static void main(String[] args) {
		/*
		 * 
		 */
		
//			select product_name, count(*) CNT
//			from product group by product_name;
//
//			select avg(product_price) AVG, max(product_price) HIGH from product;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			String sql ="select product_name, count(*) CNT, avg(product_price) AVG, max(product_price) HIGH" + 
					" from product group by product_name";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("product_name"));
				System.out.print(rs.getInt("CNT"));
				System.out.print(rs.getDouble("AVG"));
				System.out.println(rs.getDouble("HIGH"));
			}
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
