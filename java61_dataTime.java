package com.company;

public class java61_dataTime {
    public static void main(String[] args) {
        System.out.println("miliseconds : " +System.currentTimeMillis());
        // this will throw a long value which contains of miliseconds passed from 1970 to till date.

        System.out.println("Seconds : "+System.currentTimeMillis()/1000);
        System.out.println("Hours : "+System.currentTimeMillis()/1000/3600);
        System.out.println("Days : "+System.currentTimeMillis()/1000/3600/24);
        System.out.println("Years : "+System.currentTimeMillis()/1000/3600/24/365);
        
    }
    
}
