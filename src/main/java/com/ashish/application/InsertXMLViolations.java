package com.ashish.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertXMLViolations {

	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = null;
		connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/lportal_6p2","root", "root");
		String sql= "Insert INTO EchoXRV_XMLViolations values (?,20155,20624,20655,'heimdall@echostar.com',NOW(),NULL,'1af4c42a-aa3c-4da4-bc0c-ee857a68e2dd',0,'','','fax-update-tora.xml','Rules dependent on this value: (^((?!Adult).)*$) have thrown violations. ','./hotfolders/farallonArchive/a68e2dd_2015-10-16T171148.547.xml','',0,73,3,-1,-1,0,'','HBO')";
		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement(sql);
		for (int i=65;i<300;i++) {
			preparedStatement.setInt(1, i);
			preparedStatement.executeUpdate();
		}
		connection.close();
	}	
}
