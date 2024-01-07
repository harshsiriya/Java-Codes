package com.company;
import java.util.Scanner;

//Q.) Write a java prog which which detects whether the entered number is integer or not


public class exe01_pp05_checkinteger {
    public static void main(String[] args) {
        System.out.print("enter an integer : ");
        Scanner old = new Scanner(System.in);
        boolean b1 = old.hasNextInt();
        System.out.println(b1);
        
        
    }
    
}
