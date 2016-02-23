package com.ashish.application;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {

	public static void main(String args[]) {
		String dateFormat = "yyyy-MM-dd";
		SimpleDateFormat getDateStamp = new SimpleDateFormat (dateFormat);
		
		String date = getDateStamp.format(new java.util.Date());
		System.out.println(String.valueOf(date));
		
		DateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date currentDate = new Date();
		System.out.println(simpleDateFormat.format(currentDate));
		
	}
}
