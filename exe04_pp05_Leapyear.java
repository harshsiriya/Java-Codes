package com.company;
import java.util.Scanner;
public class exe04_pp05_Leapyear {
    public static void main(String[] args) {
        Scanner old = new Scanner(System.in);
        System.out.print("enter year:");
        int year = old.nextInt();
        int mod = year % 4;
        if (mod == 0){
            System.out.println("year you entered is a leap year");
        }
        else{
            System.out.println("not an leap year");
        }
    }
    
}
