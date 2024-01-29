package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","deekshu457");
		Statement stmt=con.createStatement();
		String sql="create database backend";
		boolean b=stmt.execute(sql);
		System.out.println("successfully create database");
		System.out.println("successfully connected");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	}
}
