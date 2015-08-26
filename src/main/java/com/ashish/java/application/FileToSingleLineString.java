package com.ashish.java.application;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileToSingleLineString {

	public static void main(String args[]) {
		
		FileReader fr;
		try {
			fr = new FileReader("/Users/ashishkumar.ashok/Projects/Bell/bugzilla/6401/AIHIV/AIHIV.json");
			BufferedReader br = new BufferedReader(fr);
			StringBuilder sb = new StringBuilder();
			String line = "";
			while ((line=br.readLine())!=null) {
				sb.append(line.trim());
			}
			System.out.println(sb.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
