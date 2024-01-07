package com.company;
import java.util.Scanner;

public class java04_calculatepercentage {
    public static void main(String[] args) {
        System.out.println("Calculate Percentage");
        Scanner old = new Scanner(System.in);
        System.out.print("enter marks of sub 1 : ");
        int a = old.nextInt();
        System.out.print("enter marks of sub 2 : ");
        int b = old.nextInt();
        System.out.print("enter marks of sub 3 : ");
        int c = old.nextInt();
        System.out.print("enter marks of sub 4 : ");
        int d = old.nextInt();
        System.out.print("enter marks of sub 5 : ");
        int e = old.nextInt();
        int sum = a+b+c+d+e;
        float x = sum / 5;
        System.out.print("Percentage : ");
        System.out.println(x);
        
    }
    
}
