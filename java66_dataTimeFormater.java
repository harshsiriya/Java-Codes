package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java66_dataTimeFormater {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  // this is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY --E --H:m");   // this is the formate

        String mydate = dt.format(df);  // creating date string usong date and format
        System.out.println(mydate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate1 = dt.format(df2);
        System.out.println(mydate1);
    }
    
}
