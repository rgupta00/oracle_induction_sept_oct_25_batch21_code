package com.jdbc.demo;
import java.sql.*;
public class B_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection=DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			
			PreparedStatement pstmt=connection.
					prepareStatement("insert into product(name, price) value(?,?)");
			pstmt.setString(1, "apple watch");
			pstmt.setDouble(2, 20_000);
			int noOfTupleEffected=pstmt.executeUpdate();
			
			System.out.println(noOfTupleEffected);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//print all the records
		
		
	}
}




