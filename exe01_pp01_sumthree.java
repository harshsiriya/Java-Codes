package com.company;
import java.util.Scanner;

//Q.) write a prog to sum a three numbers in java


public class exe01_pp01_sumthree {
    public static void main(String[] args) {
        System.out.println("Sum three Numbers Here");
        Scanner old = new Scanner(System.in);
        System.out.print("Enter number 1 :");
        int a = old.nextInt();
        System.out.print("Enter number 2 :");
        int b = old.nextInt();
        System.out.print("Enter number 3 :");
        int c = old.nextInt();
        int sum = a+b+c;
        System.out.print("Sum : ");
        System.out.println(sum);

        
    }
    
}
