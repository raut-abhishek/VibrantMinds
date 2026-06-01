package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDatabase {
	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_learning", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	public static void closeConnection(Connection con, PreparedStatement pst) {
		try {
			con.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs) {
		try {
			con.close();
			pst.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


