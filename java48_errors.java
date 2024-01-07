package com.company;

import java.util.Scanner;

public class java48_errors {
    public static void main(String[] args) {
        // Syntax errors demo 
        //  int a = 0  // Error : no semicolon
        // b = 21; // Error: b is not declared

        // Logical error demo
        // write a program to print prime numbers betweeen 1 to 10
        System.out.println(2);
        for(int i = 1; i < 5; i++){
            System.out.println(2 * i + 1);
        }
        // Error : written a code to print odd numbers 

        // Runtime Error (Exception) Demo  
        int k;
        Scanner old = new Scanner(System.in);
        System.out.print("Enter k :");
        k = old.nextInt();
        System.out.println("Integer part of 1000 divided by k is : " + 1000/k);
        // if we divide 1000 by 0 , java throughs an arithmatic error
        

    }
    
}
