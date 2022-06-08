package com.BSIT.Connection;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CRUD {

	public static void main(String[] args) {

		String name = "Veera";

		List<Map<String, Object>> mlist = selectQuery(name);

		System.out.println(mlist);

//		insertQuery(url, username, password);
	}

	public static List<Map<String, Object>> selectQuery(String name) {

		String url = "jdbc:oracle:thin:@192.168.1.40:1521:orcl", username = "ORCLTEST", password = "ORCLTEST";

		List<Map<String, Object>> mapList = new ArrayList<>();
		try {
			String sQuery = "SELECT * FROM cruddemo1 where name =?";

			Connection connection = CRUD.dbConnection(url, username, password);

			PreparedStatement pst = connection.prepareStatement(sQuery);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();

			// System.out.println("Resultset :" + rs);

			while (rs.next()) {
				Integer idey = rs.getInt("ID");
				String name1 = rs.getString("NAME");
				BigDecimal age = rs.getBigDecimal("AGE");
				String depart = rs.getString("DEPARTMENT");
				String language = rs.getString("LANGUAGE");
				BigDecimal marks = rs.getBigDecimal("MARKS");

				 Map<String, Object> map = new HashMap<>();
				map.put("ID", idey);
				map.put("NAME", name1);
				map.put("AGE", age);
				map.put("DEPARTMENT", depart);
				map.put("LANGUAGE", language);
				map.put("MARKS", marks);

				mapList.add(map);
			}

		} catch (Exception e) {
			System.err.println("Error message" + e.getMessage());
		}
		return mapList;
	}

//	public static void insertQuery(String url,String username,String password) {
//		
//		try {
//			
//			String sql = "insert into cruddemo1(name,age,department,language,marks) values(?,?,?,?,?)";
//			
//			Connection connection = CRUD.dbConnection(url, username, password);
//			
//			PreparedStatement pst = connection.prepareStatement(sql);
////			pst.setInt(1, 03);
//			pst.setString(1, "Veera");
//			pst.setInt(2,25);
//			pst.setString(3, "Kotak");
//			pst.setString(4, "Tamil");
//			pst.setInt(5, 65);
//			
//			int rows= pst.executeUpdate();
//			
//			if(rows>0) {
//				System.out.println("A row has been inserted successfully");
//			}
//			
//			System.out.println(pst);
//			
//		} catch(Exception e) {
//			System.err.println(e.getMessage());
//		}
//	}
//	
	public static Connection dbConnection(String url, String username, String password) {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				System.out.println("connection done");
			} else {
				System.out.println("CONNECTIOn fiald");
			}
		} catch (SQLException e) {
			System.out.println("SQLException Occured: " + e.getMessage());
			e.printStackTrace();
		}
		return connection;
	}
}
