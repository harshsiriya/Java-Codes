package com.company;
import java.util.Scanner;

//Q.) WAP which converts Kilometers to miles
public class exe01_pp04_kmtomiles {
    public static void main(String[] args) {
        System.out.println("KM TO MILES");
        Scanner old = new Scanner(System.in);
        System.out.print("Enter No. of KM : ");
        int km = old.nextInt();
        double miles = km * 0.62137;
        System.out.print("Miles : ");
        System.out.println(miles);

        
    }
    
}
