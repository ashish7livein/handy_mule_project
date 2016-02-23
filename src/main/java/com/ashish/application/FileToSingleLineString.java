package com.ashish.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileToSingleLineString {

	public static void main(String args[]) {
		System.out.println(fileToString("/Users/ashishkumar.ashok/Projects/Bell/bugzilla/6659/3K13V_ratings.xml"));
	}

	@SuppressWarnings("resource")
	public static String fileToString(String filePath) {
		FileReader fr;
		try {
			fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			StringBuilder sb = new StringBuilder();
			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line.trim().replace("\"", "\\\""));//;
				
			}
			return sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
