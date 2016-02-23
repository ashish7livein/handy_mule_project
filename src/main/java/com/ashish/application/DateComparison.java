package com.ashish.application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparison {

    public static void main (String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String matchDateTimeString = "2015-12-12T21:20:20";
        Date matchDateTime = null;
        Date now = null;
        try {
            matchDateTime = sdf.parse(matchDateTimeString);
            now = new Date();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(now);
        System.out.println(now.compareTo(matchDateTime));
        
        
    }
}
