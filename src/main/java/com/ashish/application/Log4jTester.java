package com.ashish.application;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.log4j.Logger;

public class Log4jTester {

	 private final static Logger LOGGER = Logger.getLogger(Log4jTester.class);

		
	public static void main (String args[]) {
		try {
			FileReader file = new FileReader(new File("/users/ashishkumar.ashok/Desktop/abc.html"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
			LOGGER.error(e.getLocalizedMessage());
			
			//LOGGER.error(e.getMessage(), e.getCause());
			
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.getMessage());
	//		System.out.println(e.getCause());
		}
		
	}
}
