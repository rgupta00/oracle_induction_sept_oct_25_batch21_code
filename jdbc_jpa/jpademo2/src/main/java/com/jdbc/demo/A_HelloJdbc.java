package com.jdbc.demo;
import java.sql.*;
public class A_HelloJdbc {

	public static void main(String[] args) {
		//load the driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//create a connection object
		try {
			Connection connection=DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			System.out.println("conn is done :)");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" : "+ 
			rs.getString("name")+" : "+ rs.getDouble("price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//print all the records
		
		
	}
}
