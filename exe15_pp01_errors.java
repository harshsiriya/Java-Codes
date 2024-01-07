package com.company;

import java.util.Scanner;

public class exe15_pp01_errors {
    public static void main(String[] args) {
        // Errors 
        // 1.) Syntax 
        // int k = 10                // no semicolon 

        // 2.) logical
        for(int i = 0 ; i< 5; i++){
            System.out.println(2*i + 1);    // logical Error : thinking of prime number code and writing code for odd numbers
        }

        // 3.) Runtime Error (Exception)
        Scanner old = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int k = old.nextInt();
        System.out.println("division of thousand by the entered number is : " + 1000/k);
        // this will basically throw an error when k is 0

        

    }
    
}
