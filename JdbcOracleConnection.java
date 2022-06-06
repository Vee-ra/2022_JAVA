package com.BSIT.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleConnection {

	public static void main(String[] args) {
		
		String dbURL = "jdbc:oracle:thin:@192.168.1.40:1521:orcl";
		String username = "ORCLTEST";
		String password = "ORCLTEST";
		
		try {
			Connection connection = DriverManager.getConnection(dbURL,username,password);
			
////			String sql = "INSERT INTO STUDENTS(name, email)" + "VALUES('Veera','abc@mycompany.com')";
//			String sql = "INSERT INTO STUDENTS(name, email)" + "VALUES(?,?)";
////			Statement statement =connection.createStatement();
//			PreparedStatement statement =connection.prepareStatement(sql);
////			int rows = statement.executeUpdate(sql);
//			statement.setString(1, "Veera");
//			statement.setString(2, "cby@mycompany.com");
//			int rows = statement.executeUpdate();
//			
//			if(rows >0) {
//				System.out.println("A row has been inserted.");
//			}
			
			String sql = "select * from students";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count= 0;
			
			while(result.next()) {
				count++;
				String name = result.getString("name");
				String email = result.getString("email");
				
				System.out.println("Student " + count + ":" + name + "-" + email);
				
			}
			connection.close();
			
		} catch(SQLException e) {
			System.out.println("Oops, error:");
			e.printStackTrace();
		}
		
		}
	}
