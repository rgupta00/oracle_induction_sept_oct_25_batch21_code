package com.demo;

import java.sql.*;

public class D_Delete {
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
					.prepareStatement("delete from product where id=?");
			pstmt.setInt(1, 6);
			int noOfTupleEffected=pstmt.executeUpdate();
			System.out.println(noOfTupleEffected);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
