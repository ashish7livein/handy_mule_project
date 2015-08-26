package com.ashish.java.application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AliasNetworkJDBC {
	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = null;
		connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/cerberus_test","root", "root");
		String sql= "Select networkName from networks";
		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		
		int count=0;
		while (rs.next()) {
			String name = rs.getString("networkName");
			System.out.println("<value ruletype=\"3\">");
			System.out.println("    <stringvalue>^"+name.replace("&", "&amp;")+"$</stringvalue>");
			System.out.println("</value>");
			
			count++;
		}
		System.out.println("count networkName : "+count);
		System.out.println("*******************************");
		sql= "Select aliasName from networkAlias";
		preparedStatement = connection.prepareStatement(sql);
		rs = preparedStatement.executeQuery();
		
		count=0;
		while (rs.next()) {
			String name = rs.getString("aliasName");
			System.out.println("<value ruletype=\"3\">");
			System.out.println("    <stringvalue>^"+name.replace("&", "&amp;")+"$</stringvalue>");
			System.out.println("</value>");
			
			count++;
		}
		System.out.println("count aliasName : "+count);
		connection.close();
	}
}
