package com.ashish.application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class CalenderUtilToMilli {

    public static void main (String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");    
        Calendar calender =  new GregorianCalendar(1988, 10, 14, 21, 30, 0);
        
        Date date = calender.getTime();
        long ms = date.getTime();
        System.out.println(ms);
        Random random = new Random(ms);
        for (int i=0 ;i<5; i++) {
            System.out.println(random.nextInt(69));
        }
        System.out.println(random.nextInt(26));
       System.out.println(sdf.format(calender.getTime()));
        System.out.println(calender.getTimeZone());
        
        
    }
}
