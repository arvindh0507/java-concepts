package com.exceptions;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) throws SQLException  {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			//<! -- This line throws Exception -->// ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception sqe){
			System.out.println(sqe);
		}
		finally {
			
		}
	}
}
