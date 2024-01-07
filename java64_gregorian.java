package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class java64_gregorian {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY) + " : " + c1.get(Calendar.MINUTE) + " : " + c1.get(Calendar.SECOND));

        GregorianCalendar g1 = new GregorianCalendar();
        System.out.println(g1.isLeapYear(2020));

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
    
}
