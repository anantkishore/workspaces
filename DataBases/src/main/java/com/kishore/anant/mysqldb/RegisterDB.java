package com.kishore.anant.mysqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDB {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", "root", "root1234");
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS register(uname VARCHAR(200),age INT(20),email VARCHAR(200),username VARCHAR(30), password VARCHAR(50))");
			create.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeConnection(Connection con, PreparedStatement pst) {
		try {
			if (con != null) {
				con.close();
			}
			if (pst != null) {
				pst.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}