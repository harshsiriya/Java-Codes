package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class exe16_pp02_date {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1.getHours() + " : " + d1.getMinutes() + " : " + d1.getSeconds());

        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTime());

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:S");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
    
}
