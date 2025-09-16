package com.demo;
import java.sql.*;

public class C_Update {
	public static void main(String args[]) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = 
				DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr")){
	
			PreparedStatement pstmt= connection
					.prepareStatement("update product set price=? where id=?");
			pstmt.setDouble(1, 66.5);
			pstmt.setInt(2, 6);
			
			int noOfTupleEffected=pstmt.executeUpdate();
			
			System.out.println(noOfTupleEffected);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
