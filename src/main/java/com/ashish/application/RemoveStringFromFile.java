package com.ashish.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RemoveStringFromFile {

	public static void main (String args[]) {
		removeString("Hibernate:","/Users/ashishkumar.ashok/Projects/Bell/database/mysqlQueriesUsedBy_Heimdall_v2_Chameleon_v2/chameleon-v2_select_scripts.sql");
	}
	
	public static void removeString(String removeString, String filePath) {
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				line = line.replace(removeString, "");
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
