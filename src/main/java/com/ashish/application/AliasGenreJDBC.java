package com.ashish.application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AliasGenreJDBC {

	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = null;
		connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/catalog","root", "root");
		String sql= "Select name from alias where category =?";
		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, "ADULT");
		ResultSet rs = preparedStatement.executeQuery();
		
		int count=0;
		while (rs.next()) {
			String name = rs.getString("name");
			System.out.println("<value ruletype=\"3\">");
			System.out.println("    <stringvalue>^"+name.replace("&", "&amp;")+"$</stringvalue>");
			System.out.println("</value>");
			
			count++;
		}
		connection.close();
		
	}
}
