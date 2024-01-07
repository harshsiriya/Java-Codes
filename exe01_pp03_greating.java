package com.company;
import java.util.Scanner;

//Q.) WAP which asks the user to enter there name and Greet them


public class exe01_pp03_greating {
    public static void main(String[] args) {
        System.out.print("Enter your Name :");
        Scanner old = new Scanner(System.in);
        String name = old.nextLine();
        System.out.print("hello ");
        System.out.print(name);
        System.out.print(", Have A Good Day.");

        
    }
    
}
