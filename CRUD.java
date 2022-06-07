package com.kotak.util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@192.168.1.40:1521:orcl", username = "ORCLTEST", password = "ORCLTEST";

		dbConnection(url, username, password);

		int id = 3;
//		CRUD crud = new CRUD();
		selectQuery(id, url, username, password);
	}

	public void insertValues() {

//		String iQuery = null;
//		try {
//			
//		}
//		

	}

	public static List<HashMap<String, Object>> selectQuery(int id, String url, String username, String password) {

		HashMap<String, Object> map = new HashMap<String, Object>();

		List<HashMap<String, Object>> mapList = new ArrayList<HashMap<String, Object>>();

		try {
			String sQuery = "SELECT * FROM cruddemo where id = ?";

			Connection conn = CRUD.dbConnection(url, username, password);

			PreparedStatement pst = conn.prepareStatement(sQuery);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			System.out.println("ERESULT SET: " + rs);

			while (rs.next()) {
				Integer idey = rs.getInt("ID");
				String name = rs.getString("NAME");
				BigDecimal age = rs.getBigDecimal("AGE");
				String depart = rs.getString("DEPARTMENT");
				String lang = rs.getString("LANGAUAGE");
				BigDecimal marks = rs.getBigDecimal("MARKS");

				map.put("ID", idey);
				map.put("NAME", name);
				map.put("AGE", age);
				map.put("DEPARTMENT", depart);
				map.put("LANGUAGE", lang);
				map.put("MARKS", marks);

				mapList.add(map);
			}

			System.out.println(mapList);
		} catch (Exception e) {
			System.err.println("Exception Occured: " + e.getMessage());

		}
		return mapList;
	}

	public static Connection dbConnection(String url, String username, String password) {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);

			if (conn != null) {
				System.out.println("CONNECTION ESTABLISHED: " + conn);
			} else {
				System.out.println("CONNECTION  NOT ESTABLISHED: " + conn);
			}
		} catch (SQLException e) {

			System.out.println("SQLEXCEPTION OCCURED: " + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

}
