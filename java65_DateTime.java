package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java65_DateTime {
    public static void main(String[] args) {
        LocalDate l1 = LocalDate.now();
        System.out.println(l1);

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        
    }
    
}
