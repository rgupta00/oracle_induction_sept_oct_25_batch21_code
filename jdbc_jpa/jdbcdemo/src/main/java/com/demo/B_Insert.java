package com.demo;
//1. import the package
import java.sql.*;

public class B_Insert {
	public static void main(String args[]) {
		// 2. load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 3. get a conn object
		try (Connection connection = 
				DriverManager
				.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr")){
			
			
			//4. use statement 
			//Statement vs PreprepareStatement vs CallableStatement
			//Statement: sql injection select * from product where id=1 or 1=1;
					// performance issue
			//PreprepareStatement: no issue of sql injection and it can be cache
			//CallableStatement: PreprepareStatement+ store procedure
			
			PreparedStatement pstmt= connection
					.prepareStatement("insert into product(name, price) values(?,?)");
			pstmt.setString(1, "pencil");
			pstmt.setDouble(2, 60.5);
			int noOfTupleEffected=pstmt.executeUpdate();
			System.out.println(noOfTupleEffected);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
