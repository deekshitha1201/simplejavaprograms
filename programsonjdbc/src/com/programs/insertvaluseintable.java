package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertvaluseintable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend","root","deekshu457");
			Statement stmt=con.createStatement();
			String query="insert into table student values(1,22,'deekshitha','2001-01-12','female','srikakulam',10000)";
			int b=stmt.executeUpdate(query);
			System.out.println("successfully inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
