package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addcolumnonexistingtable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","deekshu457");
			Statement stmt=con.createStatement();
			String sql="alter table student add column salary int";
			boolean b=stmt.execute(sql);
			System.out.println("successfully added column");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
