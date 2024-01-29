package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createdatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","deekshu457");
			Statement stmt=con.createStatement();
			String s="create table employee(id int,age int)";
			boolean b=stmt.execute(s);
			System.out.println("created table");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
