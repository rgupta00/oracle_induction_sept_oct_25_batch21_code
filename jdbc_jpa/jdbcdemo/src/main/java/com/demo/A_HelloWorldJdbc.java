package com.demo;
//1. import the package
import java.sql.*;

public class A_HelloWorldJdbc {
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
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr")){
			
			System.out.println("conn is done");
			//4. use statement 
			Statement stmt = connection.createStatement();
			//5. decide what u want to do? print the rec executeQuery--> rs
			
			ResultSet rs = stmt.executeQuery("select * from product");// executeQuery vs executeUpdate
			//6. iterate it 
			while (rs.next()) {
				System.out.println(rs.getInt("id") + ": " + rs.getString("name") + ": " + rs.getDouble("price"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
